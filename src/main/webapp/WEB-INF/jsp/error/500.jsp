<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Stocks Backend</title>
<jsp:include page="../include/stdCssJsRequired.jsp"/>
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	<jsp:include page="../include/header.jsp"/>
	<div id="main">
		<br/>
		<div style="width:75%;font-size:150%;color:red;">
			Error 500!
		</div>
		<br/>
		<a href="${contextPath}/home">Return home</a>
		<br/>
		<br/>
	</div>
	<jsp:include page="../include/footer.jsp"/>
</body>
</html>
