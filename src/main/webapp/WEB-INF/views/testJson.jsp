<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Title</title>
    <script  type="text/javascript" src="../../jquery/jquery-1.4.3.js">//引入jquery框架
    </script>
</head>
<body>
    <input id="doit" type="button" value="ok" onclick="test()"/>
</body>
<script type="text/javascript">
    function test(){
        var data= [{name:"jon",age:"12"},{name:"jic",age:"18"},{name:"petter",age:"14"}];
        $.ajax({
            type: "POST",
            url: "test2.do",
            data: {"ds":JSON.stringify(data)},
            dataType:JSON,
            success: function(msg){
                alert( "Data Saved: " + msg );
            }

        });
    }

</script>
</html>
