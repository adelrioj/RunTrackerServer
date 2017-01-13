<%@include file="custom_init.jsp"%>

<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Route" %>
<%@ page import="es.eina.tfg.RunTrackerBL.util.UserUtils" %>

<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Route route = (Route)row.getObject();
%>
<liferay-ui:icon-menu>
    <!-- View section -->
    <portlet:renderURL var="viewRouteURL">
        <portlet:param name="${constants.PARAM_ROUTEID}" value="<%= String.valueOf(route.getIdRoute()) %>" />
    </portlet:renderURL>
    <liferay-ui:icon image="view" message="view" url="${viewRouteURL}" />
    <!--Edit section -->
    <%
        long currentUserId = UserUtils.getCurrentUserId(renderRequest);
        long idAuthor = route.getAuthor().getUserId();
        if (currentUserId == idAuthor){
    %>
    <portlet:renderURL var="editRouteURL">
        <portlet:param name="${constants.PARAM_ROUTEID}" value="<%= String.valueOf(route.getIdRoute()) %>" />
        <portlet:param name="mvcPath" value="/jsp/route_edit.jsp" />
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="edit" url="${editRouteURL}" />
    <%
        }
    %>
    <!-- Delete section -->
    <portlet:actionURL name="deleteRouteAction" var="deleteRouteURL">
        <portlet:param name="${constants.PARAM_ROUTEID}" value="<%= String.valueOf(route.getIdRoute()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete url="${deleteRouteURL}" />
</liferay-ui:icon-menu>