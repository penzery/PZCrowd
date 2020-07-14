<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
<script type="text/javascript" src="jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="layer/layer.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn1").click(function () {
            var array = [5,8,12];
            var requestBody = JSON.stringify(array);
            $.ajax({
                "url":"send/array.json",
                "type":"post",
                "data":requestBody,
                "contentType":"application/json;charset=UTF-8",//设置请求体的内容类型，告诉服务器是json格式
                "dataType":"text",
                "success":function (response) {
                    alert(response);
                },
                "error":function (response) {
                    alert(response);
                }
            });
        });

        $("#btn2").click(function () {
            $.ajax({
               "url":"get/admin.json",
               "type":"post",
               "dataType":"json",
               "success":function (response) {
                   console.log(response)
               },
               "error":function (response) {
                   console.log(response)
               }
            });
        });

        $("#layerTest").click(function () {
            layer.msg("layer");
        });
    });
</script>
<body>
<h2>Hello World!</h2>
<a href="test/ssm.html">测试SSM整合路径</a>


<br/>

<button id="btn1">Send [5,8,12] One</button>
<button id="btn2">get admin</button>
<button id="layerTest">layerTest</button>
<br/><br/>
<a href="admin/to/login/page.html">管理员登陆界面入口</a>
</body>
</html>
