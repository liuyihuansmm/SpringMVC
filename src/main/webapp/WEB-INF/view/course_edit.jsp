<%--
  Created by IntelliJ IDEA.
  User: LYH
  Date: 2016-12-20
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增课程</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/course/save" method="post">
        <label>课程名称:</label><input type="text" name="courseName" /><br><br>
        <label>课程描述:</label><input type="text" name="courseDesc" /><br><br>
        <input type="submit" value="添加"/>&nbsp;&nbsp;<input type="reset" value="重置"/>
    </form>
</body>
</html>
