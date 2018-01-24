package com.zeratul.bean;

import java.util.List;

@SuppressWarnings("all")
public class PageBean {

	// 当前页
	private Integer currentPage;
	// 每页数量
	private Integer pageSize;
	// 总页数
	private Integer totalPage;
	// 总个数
	private Integer totalSize;
	// list
	private List list;

	public PageBean(Integer currentPage, Integer pageSize, Integer totalSize) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalSize = totalSize;

		if (this.currentPage == null) {
			// 默认第一页
			this.currentPage = 1;
		}

		if (this.pageSize == null) {
			// 默认每页显示五条
			this.pageSize = 5;
		}

		// 计算总页数
		this.totalPage = (this.totalSize + this.pageSize - 1) / this.pageSize;

		// 当前页数不能小于第一页，不能大于总页数
		if(this.currentPage<1){
			this.currentPage=1;		
		}
		
		if(this.currentPage>this.totalPage){
			this.currentPage=this.totalPage;
		}
		
	}

	// 获取开始索引
	public int getStart() {
		return (this.currentPage - 1) * this.getPageSize();
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

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

}
