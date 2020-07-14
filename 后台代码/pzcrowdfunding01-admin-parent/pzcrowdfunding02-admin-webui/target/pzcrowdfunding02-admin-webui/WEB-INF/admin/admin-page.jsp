<%--
  Created by IntelliJ IDEA.
  User: penzher
  Date: 2020/4/27
  Time: 8:32 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-CN">
<%@include file="/WEB-INF/include/include-head.jsp" %>
<link rel="stylesheet" href="css/pagination.css" />
<script type="text/javascript" src="jquery/jquery.pagination.js"></script>
<script type="text/javascript">
    $(function(){
        //这是一个非常简单的demo实例，让列表元素分页显示
        //回调函数的作用是显示对应分页的列表项内容
        //回调函数在用户每次点击分页链接的时候执行
        //参数page_index{int整型}表示当前的索引页
        var initPagination = function() {
            var num_entries = ${requestScope.adminPageInfo.total};
            // 创建分页
            $("#Pagination").pagination(num_entries, {
                num_edge_entries: 3,								// 边缘页数
                num_display_entries: 5,								// 主体页数
                callback: paginationCallBack,						// 指定用户点击“翻页”的按钮时跳转页面的回调函数
                items_per_page: ${requestScope.adminPageInfo.pageSize},	// 每页要显示的数据的数量
                current_page: ${requestScope.adminPageInfo.pageNum - 1},	// Pagination内部使用pageIndex来管理页码，pageIndex从0开始，pageNum从1开始，所以要减一
                prev_text: "上一页",									// 上一页按钮上显示的文本
                next_text: "下一页"									// 下一页按钮上显示的文本
            });
        }();

        function paginationCallBack(pageIndex, jQuery) {
            // 根据pageIndex计算得到pageNum
            var pageNum = pageIndex + 1;

            // 跳转页面
            window.location.href = "admin/get/pageInfo.html?pageNum="+pageNum+"&keyword=${param.keyword}";
            return false;
        }
    });
</script>
<body>
<%@include file="/WEB-INF/include/include-nav.jsp" %>
<div class="container-fluid">
    <div class="row">
        <%@include file="/WEB-INF/include/include-sidebar.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <form action="admin/get/pageInfo.html" method="post" class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input name="keyword" class="form-control has-success" type="text" placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button type="submit" class="btn btn-warning"><i class="glyphicon glyphicon-search"></i> 查询</button>
                    </form>
                    <button type="button" class="btn btn-danger" style="float:right;margin-left:10px;"><i class=" glyphicon glyphicon-remove"></i> 删除</button>
<%--                    <button type="button" class="btn btn-primary" style="float:right;" onclick="window.location.href='add.html'"><i class="glyphicon glyphicon-plus"></i> 新增</button>--%>
                    <a href="admin/to/add/page.html" class="btn btn-primary" style="float:right;"><i class="glyphicon glyphicon-plus"></i> 新增</a>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <thead>
                            <tr>
                                <th width="30">#</th>
                                <th width="30"><input type="checkbox"></th>
                                <th>账号</th>
                                <th>名称</th>
                                <th>邮箱地址</th>
                                <th width="100">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:if test="${empty requestScope.adminPageInfo.list }">
                                <tr>
                                    <td colspan="6" align="center">抱歉！没有查询到您要的数据！</td>
                                </tr>
                            </c:if>
                            <c:if test="${!empty requestScope.adminPageInfo.list }">
                                <c:forEach items="${requestScope.adminPageInfo.list }" var="admin" varStatus="myStatus">
                                    <tr>
                                        <td>${myStatus.count }</td>
                                        <td><input type="checkbox"></td>
                                        <td>${admin.adminAccount }</td>
                                        <td>${admin.adminName }</td>
                                        <td>${admin.adminEmail }</td>
                                        <td>
<%--                                            <button type="button" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></button>--%>
                                            <a href="assign/to/assign/role/page.html?adminId=${admin.id}&pageNum=${param.pageNum}&keyword=${param.keyword}" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></a>
<%--                                            <button type="button" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></button>--%>
                                            <a href="admin/to/update/page.html?adminId=${admin.id}" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></a>
<%--                                            <button type="button" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></button>--%>
                                            <a href="admin/remove.html?adminId=${admin.id}&pageNum=${param.pageNum}&keyword=${param.keyword}" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </c:if>
                            </tbody>
                            <tfoot>
                            <tr>
                                <td colspan="6" align="center">
                                    <div id="Pagination" class="pagination"><!-- 这里显示分页 --></div>
                                </td>
                            </tr>

                            </tfoot>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
