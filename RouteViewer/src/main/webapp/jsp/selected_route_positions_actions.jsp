<%@include file="custom_init.jsp"%>

<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="es.eina.tfg.model.RouteLocation" %>

<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    RouteLocation routeLocationSelect = (RouteLocation)row.getObject();
%>
<liferay-ui:icon-menu>
    <!-- View section -->
    <portlet:renderURL var="viewRouteLocationURL">
        <portlet:param name="${constants.PARAM_SELECTEDROUTELOCATIONID}"
                       value="<%= String.valueOf(routeLocationSelect.getRoutePositionId()) %>" />
    </portlet:renderURL>
    <liferay-ui:icon image="view" message="view" url="${viewRouteLocationURL}" />
    <!-- Delete section -->
    <portlet:actionURL name="deleteRoutePositionAction" var="deleteRouteLocationURL">
        <portlet:param name="${constants.PARAM_DELETEROUTELOCATIONID}"
                       value="<%= String.valueOf(routeLocationSelect.getRoutePositionId()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete url="${deleteRouteLocationURL}" />
</liferay-ui:icon-menu>