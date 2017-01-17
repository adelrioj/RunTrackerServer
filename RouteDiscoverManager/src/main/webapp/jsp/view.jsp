<%@include file="custom_init.jsp"%>

<liferay-ui:success key="${constants.MESSAGE_ADD_ROUTE_ACTION_SUCCESS}" message="addRouteActionSuccessMessage" />
<liferay-ui:success key="${constants.MESSAGE_EDIT_ROUTE_ACTION_SUCCESS}" message="editRouteActionSuccessMessage" />
<liferay-ui:success key="${constants.MESSAGE_DELETE_ROUTE_ACTION_SUCCESS}" message="deleteRouteActionSuccessMessage" />

<div id="RouteContentDiv">
    <c:choose>
        <c:when test="${not empty requestScope.routeToEdit}">
            <div id="routeListDiv" >
                <liferay-util:include page="/jsp/route_list.jsp" servletContext="${pageContext.servletContext}" />
            </div>
            <div id="routeSelectedDiv" >
                <div id="routeNameDiv">
                    <liferay-util:include page="/jsp/selected_route_title.jsp" servletContext="${pageContext.servletContext}" />
                </div>
                <liferay-util:include page="/jsp/route_map.jsp" servletContext="${pageContext.servletContext}" />
                <div id="routeDescriptionDiv">
                    <liferay-util:include page="/jsp/selected_route_details.jsp" servletContext="${pageContext.servletContext}" />
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <div id="routeListDivEmpty" >
                <liferay-util:include page="/jsp/route_list.jsp" servletContext="${pageContext.servletContext}" />
            </div>
        </c:otherwise>
    </c:choose>
</div>