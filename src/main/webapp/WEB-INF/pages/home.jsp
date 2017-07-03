<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Users</title>
    <script type="text/javascript" src="/resources/paging/paging.js"></script>
    <script type="text/javascript" src="/resources/js/script.js"></script>
    <style type="text/css">
        table tbody tr:hover {background-color:#9acfea}

        .pg-normal {
            color: black;
            font-weight: normal;
            text-decoration: none;
            cursor: pointer;
        }
        .pg-selected {
            color: black;
            font-weight: bold;
            text-decoration: underline;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div align="center">
    <h1> Пользователи </h1>
    <a href="newUser" style="height: 20px">Новый пользователь</a>
    <div>
        Поиск по имени:
        <input type="text" id="userName" onkeydown="makeSearchUserRequest(event, this)">
        <script type="text/javascript">
            document.getElementById("userName").value =  getParameterByName("userName");
        </script>
    </div>
    <table class="table" id="usersTable" border="1">
        <thead>
            <th>Имя</th>
            <th>Возраст</th>
            <th>Админ?</th>
            <th>Дата добавления</th>
            <th>Операция</th>
        </thead>

        <tbody>
        <c:forEach var="user" items="${usersList}">
            <tr>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.admin}</td>
                <td>${user.createdDate}</td>
                <td><a href="editUser?id=${user.id}">Редактировать</a></br>
                    <a href="deleteUser?id=${user.id}">Удалить</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div id="pageNavPosition"></div>
</div>

<script type="text/javascript">
    var pager = new Pager('usersTable', 5);
    pager.init();
    pager.showPageNav('pager', 'pageNavPosition');
    pager.showPage(1);
</script>

</body>
</html>
