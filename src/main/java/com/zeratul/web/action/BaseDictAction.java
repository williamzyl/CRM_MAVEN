package com.zeratul.web.action;

import java.util.List;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zeratul.bean.BaseDict;
import com.zeratul.service.BaseDictService;

public class BaseDictAction extends ActionSupport implements
		ModelDriven<BaseDict> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8095409324416468591L;

	private BaseDictService bds;
	private BaseDict baseDict = new BaseDict();

	@Override
	public String execute() throws Exception {

		DetachedCriteria dc = DetachedCriteria.forClass(BaseDict.class);

		dc.add(Restrictions.eq("typeCode", baseDict.getTypeCode()));
		
		List<BaseDict> types = bds.getBaseDictByCode(dc);
		// 2 将list转换为 json格式
		String json = JSONArray.fromObject(types).toString();
		// 3 将json发送给浏览器
		ServletActionContext.getResponse().setContentType(
				"application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(json);

		return null;// 设置null 则表示不用 Struts处理action 结果。
	}

	public void setBds(BaseDictService bds) {
		this.bds = bds;
	}

	@Override
	public BaseDict getModel() {
		return baseDict;
	}

}
