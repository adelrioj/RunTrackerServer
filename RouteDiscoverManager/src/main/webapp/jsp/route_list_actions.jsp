<%@include file="custom_init.jsp"%>

<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Route" %>

<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Route route = (Route)row.getObject();
%>
<liferay-ui:icon-menu>
    <%-- Add section--%>
    <portlet:actionURL name="addRouteAction" var="addRouteURL">
        <portlet:param name="${constants.PARAM_ROUTEID}" value="<%= String.valueOf(route.getIdRoute()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon image="add" message="addRoute" url="${addRouteURL}" />
</liferay-ui:icon-menu>