<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Insert title here</title>
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
</head>
<body>

<h1>Student List by Entry Date</h1>
<div class="container">

    <table border="1">
        <tr>
            <th>Student id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>visaStatus</th>
            <th>Status</th>
            <th>EntryDate</th>
        </tr>


        <c:forEach var="s" items="${students}">
            <tr>
                <td>${s.studentId}</td>
                <td>${s.firstName}</td>
                <td>${s.lastName}</td>
                <td>${s.emailaddress}</td>
                <td>${s.visaStatus}</td>
                <td>${s.status}</td>
                <td>${s.entryDate}</td>
            </tr>


        </c:forEach>


    </table>
</div>
</body>
</html>
