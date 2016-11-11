<%@include file="custom_init.jsp"%>

<div id="liveRoute">
    <div id="liveRouteListDiv" >
        <%--<liferay-util:include page="/jsp/route_list.jsp" servletContext="${pageContext.servletContext}" />--%>
    </div>
    <div id="routeMapDiv" >
        <div id="routeDescriptionDiv">
            <liferay-util:include page="/jsp/selected_route_details.jsp" servletContext="${pageContext.servletContext}" />
        </div>
        <liferay-util:include page="/jsp/route_map.jsp" servletContext="${pageContext.servletContext}" />
        <liferay-util:include page="/jsp/selected_route_positions.jsp" servletContext="${pageContext.servletContext}" />
    </div>
</div>