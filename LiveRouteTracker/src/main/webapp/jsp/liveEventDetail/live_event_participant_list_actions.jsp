<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="es.eina.tfg.liveRouteTracker.model.DTO.Participant" %>
<%@include file="../custom_init.jsp"%>

<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Participant participant = (Participant)row.getObject();
%>

<portlet:renderURL var="viewParticipantURL">
    <portlet:param name="${constants.PARAM_SELECTED_IDEVENT}" value="${requestScope.selectedEvent.idEvent}" />
    <portlet:param name="${constants.PARAM_SHOW_PARTICIPANT_ID}" value="<%= String.valueOf(participant.getIdUser()) %>" />
    <portlet:param name="mvcPath" value="/jsp/live_event_view.jsp" />
</portlet:renderURL>

<aui:button cssClass="btn-info"
            icon="icon-eye-open"
            iconAlign="left"
            value="viewParticipant"
            onClick="${viewParticipantURL}"/>