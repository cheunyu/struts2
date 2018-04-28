<%--
  Created by IntelliJ IDEA.
  User: foo
  Date: 2018/4/28
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello World</title>
  </head>
  <body>
    <h1>Hello World From Struts2</h1>
    <form action="hello.action">
    <label for="name">Please enter your name</label>
        <input type="text" name="name" id=""/>
        <input type="submit" value="Say Hello" />
    </form>
  </body>
</html>
