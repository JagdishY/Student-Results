<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results Application</title>
</head>
<body>
	<h1>Results Application
	<% mvc.ResultBean rb = (mvc.ResultBean)request.getAttribute("results"); %>
	HALL TICKET NUMBER:	<%= rb.getHno() %> <br>
	NAME:	<%= rb.getName() %> <br>
	C:		<%= rb.getC() %> <br>
	CPP:	<%= rb.getCpp() %> <br>
	JAVA:	<%= rb.getJava() %> <br>
	</h1>
</body>
</html>
