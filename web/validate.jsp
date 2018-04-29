<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: foo
  Date: 2018/4/30
  Time: 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate</title>
</head>
<body>

<hr/>
<s:form action="validate" method="POST">
    <h5>validate</h5>
    <s:textfield name="name" label="Name" size="20"></s:textfield>
    <s:textfield name="age" label="Age" size="20"></s:textfield>
    <s:submit name="submit" label="Submit" align="center"></s:submit>
</s:form>
</body>
</html>
