<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Добавление/редактирование пользователя</title>
</head>
<body>
    <div align="center">
        <h1>Добавить/редактировать пользователя</h1>
        <form:form action="saveUser" method="post" modelAttribute="user">
            <table>
                <form:hidden path="id"/>
                <tr>
                    <td>Имя:</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Возраст:</td>
                    <td><form:input path="age" /></td>
                </tr>
                <tr>
                    <td>Права администратора:</td>
                    <td><form:checkbox path="admin" /></td>
                </tr>
                <%--<tr>--%>
                    <%--<td>Дата добавления:</td>--%>
                    <%--<td><form:input path="createdDate" /></td>--%>
                <%--</tr>--%>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Сохранить"></td>
                </tr>
            </table>
        </form:form>
    </div>

    <script type="text/javascript" src="/resources/js/jquery-3.2.1.js"></script>
</body>
</html>
