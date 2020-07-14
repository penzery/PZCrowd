<%--
  Created by IntelliJ IDEA.
  User: penzher
  Date: 2020/4/27
  Time: 8:32 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<%@include file="/WEB-INF/include/include-head.jsp" %>

<body>
<%@include file="/WEB-INF/include/include-nav.jsp" %>
<div class="container-fluid">
    <div class="row">
        <%@include file="/WEB-INF/include/include-sidebar.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <ol class="breadcrumb">
                <li><a href="admin/to/main/page.html">首页</a></li>
                <li><a href="admin/get/pageInfo.html">数据列表</a></li>
                <li class="active">修改</li>
            </ol>
            <div class="panel panel-default">
                <div class="panel-heading">表单数据<div style="float:right;cursor:pointer;" data-toggle="modal" data-target="#myModal"><i class="glyphicon glyphicon-question-sign"></i></div></div>
                <h4>        ${requestScope.exception.message}</h4>
                <div class="panel-body">
                    <form action="admin/update/pageInfo.html" method="post" role="form">
                        <div class="form-group">
                            <label for="exampleInputPassword1">登陆账号</label>
                            <input name="id" value="${requestScope.admin.id}" type="hidden">
                            <input name="adminAccount" type="text" class="form-control" id="exampleInputPassword1" value="${requestScope.admin.adminAccount}">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">用户名称</label>
                            <input name="adminName" type="text" class="form-control" id="exampleInputPassword2" value="${requestScope.admin.adminName}">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">邮箱地址</label>
                            <input name="adminEmail" type="email" class="form-control" id="exampleInputEmail1" value="${requestScope.admin.adminEmail}">
                            <p class="help-block label label-warning">请输入合法的邮箱地址, 格式为： xxxx@xxxx.com</p>
                        </div>
                        <button type="submit" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i> 修改</button>
                        <button type="reset" class="btn btn-danger"><i class="glyphicon glyphicon-refresh"></i> 重置</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
