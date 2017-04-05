<%@include file="custom_init.jsp"%>

<liferay-ui:success key="${constants.MESSAGE_ADD_ROUTE_ACTION_SUCCESS}" message="addRouteActionSuccessMessage" />
<liferay-ui:success key="${constants.MESSAGE_EDIT_ROUTE_ACTION_SUCCESS}" message="editRouteActionSuccessMessage" />
<liferay-ui:success key="${constants.MESSAGE_DELETE_ROUTE_ACTION_SUCCESS}" message="deleteRouteActionSuccessMessage" />

<div id="RouteContentDiv">
    <c:choose>
        <c:when test="${not empty requestScope.routeToEdit}">
            <div class="container-fluid">
                <div class="row-fluid">
                    <div class="span12">
                        <h1 class="text-center">
                            <c:out value="${requestScope.routeToEdit.name}" />
                        </h1>

                        <hr />
                    </div>
                </div>
                <div class="row-fluid" >
                    <div class="span5">
                        <liferay-util:include page="/jsp/route_list.jsp" servletContext="${pageContext.servletContext}" />
                    </div>
                    <div class="span7">
                        <liferay-util:include page="/jsp/route_map.jsp" servletContext="${pageContext.servletContext}" />
                        <br />
                        <br />
                        <liferay-util:include page="/jsp/selected_route_details.jsp" servletContext="${pageContext.servletContext}" />
                    </div>
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <div class="container">
                <div class="row">
                    <div class="span12">
                        <liferay-util:include page="/jsp/route_list.jsp" servletContext="${pageContext.servletContext}" />
                    </div>
                </div>
            </div>
        </c:otherwise>
    </c:choose>
</div>