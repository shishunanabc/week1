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
<body>
	<form action="/list.do">
		种类：<select id="sp" name="tname">
				<option value="">请选择</option>
			</select>
		品牌：<select id="sp1" name="bname">
				<option value="">请选择</option>
			</select><br>
		单价：<input type="text" name="p1" value="${con.p1 }">到
			<input type="text" name="p2" value="${con.p2 }"><br>
		商品名称：<input type="text" name="name" value="${con.name }">
		英文名称：<input type="text" name="ename" value="${con.ename }">
		商品标签：<input type="text" name="biaoqian" value="${con.biaoqian }">
		<input type="submit" value="查询">
		<input type="button" value="添加" onclick="tj()">
		<table>
			<tr>
				<td>商品编号</td>
				<td>商品名称</td>
				<td>英文名称</td>
				<td>商品品牌</td>
				<td>商品种类</td>
				<td>尺寸</td>
				<td>单价（元）</td>
				<td>数量</td>
				<td>标签</td>
				<td>商品图片上传</td>
			</tr>
			<c:forEach items="${list }" var="s">
				<tr>
					<td>${s.id }</td>
					<td>${s.name }</td>
					<td>${s.ename }</td>
					<td>
						<c:forEach items="${s.brands }" var="b">
							${b.bname }
						</c:forEach>
					</td>
					<td>
						<c:forEach items="${s.types }" var="t">
							${t.tname }
						</c:forEach>
					</td>
					<td>${s.size }</td>
					<td>${s.price }</td>
					<td>${s.num }</td>
					<td>${s.biaoqian }</td>
					<td>
						<img alt="未选择任何文件" src="${s.pic }" width="50px" height="50px">
					</td>
				</tr>
			</c:forEach>
			<!-- 分页 -->
			<tr>
				<td colspan="100">
					<button name="pageNum" value="1">首页</button>
					<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
					<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage }">下一页</button>
					<button name="pageNum" value="${pg.pages }">尾页</button>
					当前${pg.pageNum }页，共${pg.pages }页，共${pg.total }条
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		$.post(
			"/type.do",
			function(asd) {
				for (var i = 0; i < asd.length; i++) {
					$("#sp").append("<option value='"+asd[i].tname+"'>"+asd[i].tname+"</option>")
				}
			},"json")
			
		$.post(
			"/brand.do",
			function(asd) {
				for (var i = 0; i < asd.length; i++) {
					$("#sp1").append("<option value='"+asd[i].bname+"'>"+asd[i].bname+"</option>")
				}
			},"json")
			
		function tj() {
			location="/view/add.jsp";
		}
	</script>
</body>
</html>