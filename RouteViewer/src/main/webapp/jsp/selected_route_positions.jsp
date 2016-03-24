<%@ page import="es.eina.tfg.service.RouteLocationLocalServiceUtil" %>
<%@include file="custom_init.jsp"%>

<liferay-ui:search-container
        hover="false"
        delta="10"
        curParam="selectedRoutePositionCurParam" >
    <liferay-ui:search-container-results >
        <%
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