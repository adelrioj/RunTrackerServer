<%@include file="custom_init.jsp"%>

<div id="routeAddDiv" >
    <liferay-util:include page="/jsp/route_add.jsp" servletContext="<%=this.getServletContext() %>" />
</div>
<br />
<br />
<div id="RouteContentDiv">
    <div id="routeListDiv" >
        <liferay-util:include page="/jsp/route_list.jsp" servletContext="<%=this.getServletContext() %>" />
    </div>
    <div id="routeMapDiv" >
        <div id="routeDescriptionDiv">
            <liferay-util:include page="/jsp/selected_route_details.jsp" servletContext="<%=this.getServletContext() %>" />
        </div>
        <liferay-util:include page="/jsp/route_map.jsp" servletContext="<%=this.getServletContext() %>" />
        <liferay-util:include page="/jsp/selected_route_positions.jsp" servletContext="<%=this.getServletContext() %>" />
    </div>
</div>