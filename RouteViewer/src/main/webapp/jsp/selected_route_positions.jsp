<%@ page import="es.eina.tfg.service.RouteLocationLocalServiceUtil" %>
<%@ page import="es.eina.tfg.model.Route" %>
<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@include file="custom_init.jsp"%>

<liferay-ui:search-container
        hover="false"
        delta="10"
        curParam="selectedRoutePositionCurParam" >
    <liferay-ui:search-container-results >
        <%
            Route route = (Route) request.getAttribute(WebKeys.PARAM_ROUTE_TO_EDIT);
            Long selectedRouteId = route.getRouteId();
            searchContainer.setResults(RouteLocationLocalServiceUtil.findByRouteId(selectedRouteId, searchContainer.getStart(), searchContainer.getEnd()));
            searchContainer.setTotal(RouteLocationLocalServiceUtil.findByRouteIdCount(selectedRouteId));
        %>
    </liferay-ui:search-container-results>
    <liferay-ui:search-container-row
            className="es.eina.tfg.model.RouteLocation"
            keyProperty="routePositionId"
            modelVar="aRoutePosition">
        <liferay-ui:search-container-column-text
                property="latitude"
                name="latitude"
                orderableProperty="latitude"
                orderable="true" />
        <liferay-ui:search-container-column-text
                property="longitude"
                name="longitude"
                orderableProperty="longitude"
                orderable="true" />
        <liferay-ui:search-container-column-jsp
                path="/jsp/selected_route_positions_actions.jsp"
                align="right" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>