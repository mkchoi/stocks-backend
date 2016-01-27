<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
<jsp:include page="include/stdCssJsRequired.jsp"/>
<script type="text/javascript">
</script>
</head>
<body>
	<jsp:include page="include/header.jsp" />
	<div id="main" style="font-size:150%;">

	<p>You have logged in this application. To logout, click on the link below.</p>

	</div>
	<br/>
	<a href="<c:url value="j_spring_security_logout" />">Logout</a>
	<br/>
	<br/>
	<jsp:include page="include/footer.jsp" />
</body>
</html>