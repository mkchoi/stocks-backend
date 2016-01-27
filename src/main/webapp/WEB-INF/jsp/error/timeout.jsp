<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
	response.setHeader("Pragma","no-cache"); //HTTP 1.0
	response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Stocks Backend</title>
<jsp:include page="../include/stdCssJsRequired.jsp"/>
</head>
<body>
	<jsp:include page="../include/header.jsp" />
	<div id="main">
		<br/>
		<div style="width:75%;font-size:150%;color:red;">
			Session timeout!
		</div>
		<br/>
		<a href="${contextPath}/home">Return home</a>
		<br/>
		<br/>
	</div>
	<jsp:include page="../include/footer.jsp" />
</body>
</html>