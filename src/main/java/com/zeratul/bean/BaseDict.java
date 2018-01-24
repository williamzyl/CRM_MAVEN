package com.zeratul.bean;

public class BaseDict {
	
	
//	`dict_id` varchar(32) NOT NULL COMMENT '数据字典id(主键)',
//	  `dict_type_code` varchar(10) NOT NULL COMMENT '数据字典类别代码',
//	  `dict_type_name` varchar(64) NOT NULL COMMENT '数据字典类别名称',
//	  `dict_item_name` varchar(64) NOT NULL COMMENT '数据字典项目名称',
//	  `dict_item_code` varchar(10) DEFAULT NULL COMMENT '数据字典项目(可为空)',
//	  `dict_sort` int(10) DEFAULT NULL COMMENT '排序字段',
//	  `dict_enable` char(1) NOT NULL COMMENT '1:使用 0:停用',
//	  `dict_memo` varchar(64) DEFAULT NULL COMMENT '备注',
	
	
	
	private String dictId;
	private String typeCode;
	private String typeName;
	private String itemCode;
	private String itemName;
	private Integer dictSort;
	private Integer enable;
	private Integer dictMemo;
	
	public String getDictId() {
		return dictId;
	}
	public void setDictId(String dictId) {
		this.dictId = dictId;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getDictSort() {
		return dictSort;
	}
	public void setDictSort(Integer dictSort) {
		this.dictSort = dictSort;
	}
	public Integer getEnable() {
		return enable;
	}
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	public Integer getDictMemo() {
		return dictMemo;
	}
	public void setDictMemo(Integer dictMemo) {
		this.dictMemo = dictMemo;
	}
	
	@Override
	public String toString() {
		return "BaseDict [dictId=" + dictId + ", typeCode=" + typeCode
				+ ", typeName=" + typeName + ", itemCode=" + itemCode
				+ ", itemName=" + itemName + ", dictSort=" + dictSort
				+ ", enable=" + enable + ", dictMemo=" + dictMemo + "]";
	}
}
