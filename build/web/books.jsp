<%-- 
    Document   : books
    Created on : Sep 29, 2020, 1:26:05 PM
    Author     : potte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books</title>
    </head>
    <body>
        <h1>Books Page</h1>
        <s:if test="%{listBookCate != null}">
            <h1>Co data ta</h1>
        </s:if>
    </body>
</html>
