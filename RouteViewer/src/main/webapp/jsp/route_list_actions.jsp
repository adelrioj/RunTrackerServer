<%@include file="custom_init.jsp"%>

<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="es.eina.tfg.model.Route" %>

<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Route route = (Route)row.getObject();
%>
<liferay-ui:icon-menu>
    <!-- View section -->
    <portlet:renderURL var="viewRouteURL">
        <portlet:param name="${constants.PARAM_ROUTEID}" value="<%= String.valueOf(route.getRouteId()) %>" />
    </portlet:renderURL>
    <liferay-ui:icon image="view" message="view" url="${viewRouteURL}" />
    <!--Edit section -->
    <portlet:renderURL var="editRouteURL">
        <portlet:param name="${constants.PARAM_ROUTEID}" value="<%= String.valueOf(route.getRouteId()) %>" />
        <portlet:param name="mvcPath" value="/jsp/route_edit.jsp" />
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="edit" url="${editRouteURL}" />
    <!-- Delete section -->
    <portlet:actionURL name="deleteRouteAction" var="deleteRouteURL">
        <portlet:param name="${constants.PARAM_ROUTEID}" value="<%= String.valueOf(route.getRouteId()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete url="${deleteRouteURL}" />
</liferay-ui:icon-menu>