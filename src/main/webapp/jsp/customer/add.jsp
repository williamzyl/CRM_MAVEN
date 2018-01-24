﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE><s:property value="#customer==null?'添加':'修改'" />客户</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/loadDict.js"></script>
<script type="text/javascript">

	$(document).ready(function(){

	loadDict("006","custLevel" <s:if test="#customer.custLevel!=null">,<s:property value="#customer.custLevel.dictId" /></s:if>);
	loadDict("001","custIndustry" <s:if test="#customer.custIndustry!=null">,<s:property value="#customer.custIndustry.dictId" /></s:if>);
	loadDict("009","custSource" <s:if test="#customer.custSource!=null">,<s:property value="#customer.custSource.dictId" /></s:if>);
	});

	</script>


<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>


	<FORM id="addCustomerForm" name="addCustomerForm"
		action="${pageContext.request.contextPath }/customer_add"
		method="post">
		
		<input type="hidden" name="custId" value='<s:property value="#customer.custId"/>'>

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：客户管理 &gt; <s:property value="#customer==null?'添加':'修改'" />客户</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<TR>
								<td>客户名称：</td>
								<td>
								<INPUT class=textbox id=custName type="text" value="<s:property value="#customer.custName"/>" style="WIDTH: 180px" maxLength=50 name="custName"> 
								</td>
								<td>客户级别 ：</td>
								<td>
							 <select id="custLevel" name="custLevel.dictId"></select>
								</td>
							</TR>
							
							<TR>
								
								<td>信息来源 ：</td>
								<td>
								 <select id="custSource" name="custSource.dictId"></select>
								</td>
								<td>联系人：</td>
								<td>
								<INPUT class=textbox id=custLinkman type="text" value="<s:property value="#customer.custLinkman"/>"
														style="WIDTH: 180px" maxLength=50 name="custLinkman"> 
								</td>
							</TR>
							
							<TR>
								<td>固定电话 ：</td>
								<td>
								 <INPUT class=textbox id=custPhone type="text" value="<s:property value="#customer.custPhone"/>"
														style="WIDTH: 180px" maxLength=50 name="custPhone"> 
								</td>
								<td>移动电话 ：</td>
								<td>
								 <INPUT class=textbox id=custMobile type="text" value="<s:property value="#customer.custMobile"/>"
														style="WIDTH: 180px" maxLength=50 name="custMobile"> 
								</td>
							</TR>
							<TR>
								<%--<td>客户传真 ：</td>--%>
								<%--<td>--%>
								<%--<INPUT class=textbox id=sChannel2--%>
														<%--style="WIDTH: 180px" maxLength=50 name="custFax">--%>
								<%--</td>--%>
								<td>客户行业 ：</td>
								<td>
	                              <select id="custIndustry" name="custIndustry.dictId"></select> >
								</td>
							</TR>
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
