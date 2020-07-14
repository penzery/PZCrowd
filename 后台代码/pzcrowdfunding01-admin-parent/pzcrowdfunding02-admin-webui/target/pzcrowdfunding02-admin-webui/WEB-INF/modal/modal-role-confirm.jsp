<%--
  Created by IntelliJ IDEA.
  User: penzher
  Date: 2020/4/30
  Time: 4:46 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="confirmModal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">喷汁众筹系统弹窗</h4>
            </div>
            <div class="modal-body">
                <h4>请确认是否删除下列角色</h4>
                <div id="roleNameDiv" style="text-align:center"></div>
            </div>
            <div class="modal-footer">
                <button id="removeRoleBtn" type="button" class="btn btn-primary">OK</button>
            </div>
        </div>
    </div>
</div>
