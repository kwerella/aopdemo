<%-- 
    Document   : booking
    Created on : Dec 27, 2016, 6:20:41 PM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.servletContext.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Booking Page</h1>
        <hr/>
        <sf:form action="${contextRoot}/booking.htm" modelAttribute="boxOffice" method="post">
            Enter no of tickets: <sf:input path="quantity"/> <hr/>
            Select Movie: 
            <sf:radiobutton path="movie" value="Befikre"/> Befikre &#160;
            <sf:radiobutton path="movie" value="Dangal"/> Dangal &#160;
            <hr/>
            <input type="submit" value="Book Tickets"/>            
        </sf:form>
    </body>
</html>
