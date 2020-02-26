<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%String path=request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link  href="<%=request.getContextPath() %>/css/index3.css"     rel="stylesheet"   type="text/css">
<script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script> 
<script type="text/javascript"  src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js"></script> 
</head>
<body>										<!-- 图片上传 -->
	<form action="/add.do" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>商品编号：</td>
				<td>
					<input type="text" name="id">
				</td>
			</tr>
			<tr>
				<td>商品名称：</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>英文名称：</td>
				<td>
					<input type="text" name="ename">
				</td>
			</tr>
			<tr>
				<td>商品品牌：</td>
				<td>
					<select id="sp1" name="bd">
						<option value="">请选择</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>商品种类：</td>
				<td>
					<select id="sp" name="te">
						<option value="">请选择</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>尺寸：</td>
				<td>
					<input type="text" name="size">
				</td>
			</tr>
			<tr>
				<td>单价（元）：</td>
				<td>
					<input type="text" name="price">
				</td>
			</tr>
			<tr>
				<td>数量：</td>
				<td>
					<input type="text" name="num">
				</td>
			</tr>
			<tr>
				<td>标签：</td>
				<td>
					<input type="text" name="biaoqian">
				</td>
			</tr>
			<tr>
				<td>商品图片上传：</td>
				<td>
					<input type="file" name="f">
				</td>
			</tr>
			<tr>
				<td colspan="10">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form>
	
	<script type="text/javascript">
		$.post(
			"/type.do",
			function(asd) {
				for (var i = 0; i < asd.length; i++) {
					$("#sp").append("<option value='"+asd[i].tid+"'>"+asd[i].tname+"</option>")
				}
			},"json")
			
		$.post(
			"/brand.do",
			function(asd) {
				for (var i = 0; i < asd.length; i++) {
					$("#sp1").append("<option value='"+asd[i].bid+"'>"+asd[i].bname+"</option>")
				}
			},"json")
	</script>
</body>
</html>