<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <script  type="text/javascript" src="../../jquery/jquery-1.4.3.js">//引入jquery框架
    </script>
</head>
<body>
    <h2>Hello World!</h2>
    <input id="input" type="text"/>
    <input id="test" type="button" value="test" onclick="test()"/>
</body>
<script>
    function test(){
        var text = $("#input").attr("value");
        alert("ok:"+text);
    }
</script>
</html>
