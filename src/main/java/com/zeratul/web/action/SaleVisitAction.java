package com.zeratul.web.action;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zeratul.bean.PageBean;
import com.zeratul.bean.SaleVisit;
import com.zeratul.bean.User;
import com.zeratul.service.SaleVistService;

public class SaleVisitAction extends ActionSupport implements ModelDriven<SaleVisit> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6123640022764386165L;
	
	private SaleVisit saleVisit=new SaleVisit();
	
	private SaleVistService svs;
	
	private Integer currentPage;
	private Integer pageSize;
	
	 public String add(){
		 
		 Map<String, Object> session = ActionContext.getContext().getSession();
		 User user = (User) session.get("user");
		 saleVisit.setUser(user);
		 if(StringUtils.isBlank(saleVisit.getVisitId())){
			 saleVisit.setVisitId(null);
		 }
		 svs.save(saleVisit);
	
		 return "toList";
	 }
	 
	 public String list(){
		 
		 DetachedCriteria dc=DetachedCriteria.forClass(SaleVisit.class);
		 
		 if(saleVisit.getCustomer()!=null&& saleVisit.getCustomer().getCustId()!=null){
				dc.add(Restrictions.eq("customer.custId", saleVisit.getCustomer()
						.getCustId()));
		 }
		 
		 PageBean pageBean= svs.getSaleVisitPage(dc,currentPage,pageSize);
		 
		 ActionContext.getContext().put("pageBean", pageBean);
		 
		 return "list";
	 }
	 
	 public String update(){
		  
		 SaleVisit saleVistiById = svs.getSaleById(saleVisit.getVisitId());
		 
		 ActionContext.getContext().put("saleVisit", saleVistiById);
		 
		return "toUpdate";
		 
	 }
	 
	 
	public String delete(){
		svs.delete(saleVisit);
		
		return "toList";
	}
	 
	public void setSvs(SaleVistService svs) {
		this.svs = svs;
	}

	@Override
	public SaleVisit getModel() {
		return saleVisit;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}


}
