<%-- 
    Document   : Index
    Created on : 11/02/2018, 04:56:21 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Session</title>
    </head>
    <body>
        <h1>Inicio Sesión</h1>
        
        <form action="Validate.do" method="post">
            <input type="text" name="txtMail" placerholder="E-mail" required="required"/><br/>
            <input type="password" name="txtPass" placerholder="Contraseña" required="required"/><br/>
            <input type="submit" value="Iniciar Sesion"/>
        </form>
        
    </body>
</html>
