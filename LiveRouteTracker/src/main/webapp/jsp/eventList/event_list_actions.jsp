<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Event" %>
<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@include file="../custom_init.jsp"%>

<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Event event = (Event)row.getObject();
%>
    <portlet:renderURL var="viewEventURL">
        <portlet:param name="${constants.PARAM_SELECTED_IDEVENT}" value="<%= String.valueOf(event.getIdEvent()) %>" />
        <portlet:param name="mvcPath" value="/jsp/live_event_view.jsp" />
    </portlet:renderURL>

    <aui:button cssClass="btn-info"
                icon="icon-eye-open"
                iconAlign="left"
                value="view-live"
                onClick="${viewEventURL}"/>

