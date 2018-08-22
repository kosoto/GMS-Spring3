<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype html>
<html lang="en">
	<jsp:include page="head.jsp"/>
<body>	
<div id="wrapper">
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div> <!-- header end -->
	<jsp:include page="content-box.jsp"/>
	<div id="footer">주소</div>
</div>
<script>
	common.main('${context}');
</script>
</body>
</html>

