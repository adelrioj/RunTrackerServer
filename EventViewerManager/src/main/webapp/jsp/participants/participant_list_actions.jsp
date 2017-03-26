<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="es.eina.tfg.EventViewerManager.model.DTO.Participant" %>
<%@include file="../custom_init.jsp"%>

<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Participant participant = (Participant)row.getObject();
%>

<liferay-ui:icon-menu>
    <c:choose>
        <c:when test="${empty requestScope.requestedEvent.realStartTime}">
            <!-- Delete section -->
            <portlet:actionURL name="deleteParticipantAction" var="deleteParticipantURL">
                <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
                <portlet:param name="${constants.PARAM_SELECTED_PARTICIPANT_ID}" value="<%= String.valueOf(participant.getIdUser()) %>" />
                <portlet:param name="mvcPath" value="/jsp/participants/view_participants.jsp" />
            </portlet:actionURL>
            <liferay-ui:icon-delete url="${deleteParticipantURL}" label="deleteEvent" />
        </c:when>
    </c:choose>
</liferay-ui:icon-menu>
