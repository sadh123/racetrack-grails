<%--
  Created by IntelliJ IDEA.
  User: sadhana
  Date: 1/23/19
  Time: 3:08 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main" />
    <title>Login</title>
</head>

<body>
<div class="body">
    <h1>Login</h1>
    <g:if test="${flash.message}">
        <div class="message">${flash.message}</div>
    </g:if>

    <g:form action="authenticate" method="post">
        <div class="dialog">
            <table>
                <tbody>
                <tr class=""prop>
                    <td valign="top" class="name">
                        <label for="login">Login:</label>
                    </td>
                    <td valign="top"> <input type="text" name="login"/></td>
                </tr>
                </tbody>
                <tr class="prop">
                    <td valign="top" class="name">
                        <label for="password">password:</label>
                    </td>
                    <td valign="top"> <input type="text" name="password"/></td>
                </tr>
            </table>
        </div>
        <div class="buttons" >
            <span class="button">
                <input type="submit" value="login">
            </span>
        </div>
    </g:form>
</div>
</body>
</html>