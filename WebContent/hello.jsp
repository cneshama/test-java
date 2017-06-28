<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ taglib uri="/WEB-INF/otxjsptag.tld" prefix="otxjsp" %>
<jsp:useBean
	id="helloBean" scope="request"
	type="com.nec.webotx.webapp.tutorial.HelloBean"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>Hello</title>
</head>
<body>

Hello<jsp:getProperty name="helloBean" property="name" /><br>
Your score is
<jsp:getProperty name="helloBean" property="score" />.
<br>
<a href="index.html">Goodbye!</a>
<form><otxjsp:CheckData /></form>
</body>
</html>
