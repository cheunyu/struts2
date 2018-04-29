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
    <hr/>
    <form action="redirect.action">
      <h5>click redirect</h5>
      <input type="submit" value="redirect" />
    </form>
    <hr/>
    <form action="valuestack.action">
        <h5>valuestack</h5>
        <label for="name">Please enter your name</label>
        <input type="text" name="name" id=""/>
        <input type="submit" value="Say Hello" />
    </form>
    <hr/>
    <form action="upload.action" method="post" enctype="multipart/form-data">
        <h5>fileupload</h5>
        Upload your file
        <input type="file" name="myFile"/>
        <input type="submit" value="Upload" />
    </form>
  </body>
</html>
