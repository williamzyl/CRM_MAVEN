package com.zeratul.web.action;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zeratul.bean.Linkman;
import com.zeratul.bean.PageBean;
import com.zeratul.service.LinkmanService;

public class LinkmanAction extends ActionSupport implements
		ModelDriven<Linkman> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6523811625579941248L;

	private LinkmanService ls;
	private Linkman linkMan = new Linkman();
	private Integer currentPage;
	private Integer pageSize;

	public String add() {
		System.out.println(linkMan);
		ls.save(linkMan);
		return "toList";
	}

	public String list() {

		DetachedCriteria dc = DetachedCriteria.forClass(Linkman.class);

		if (StringUtils.isNotBlank(linkMan.getLkmName())) {
			dc.add(Restrictions.like("lkmName", "%" + linkMan.getLkmName()
					+ "%"));
		}

		if (linkMan.getCustomer() != null
				&& linkMan.getCustomer().getCustId() != null) {
			dc.add(Restrictions.eq("customer.custId", linkMan.getCustomer()
					.getCustId()));
		}

		PageBean linkmanPage = ls.getLinkmanPage(dc, currentPage, pageSize);

		ActionContext.getContext().put("pageBean", linkmanPage);

		return "list";

	}

	public String update() {

		Linkman l = ls.getLinkman(linkMan);

		ActionContext.getContext().put("linkMan", l);

		return "toUpdate";
	}
	
	
	public String delete(){
		ls.delete(linkMan);
		return "toList";
	}

	public void setLs(LinkmanService ls) {
		this.ls = ls;
	}

	@Override
	public Linkman getModel() {
		return linkMan;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
