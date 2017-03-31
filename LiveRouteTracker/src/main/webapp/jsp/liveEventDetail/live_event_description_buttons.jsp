<%@include file="../custom_init.jsp"%>

<portlet:renderURL var="viewAllParticipantsURL">
    <portlet:param name="${constants.PARAM_SELECTED_IDEVENT}" value="${requestScope.selectedEvent.idEvent}" />
    <portlet:param name="mvcPath" value="/jsp/live_event_view.jsp" />
</portlet:renderURL>

<aui:button cssClass="btn-info"
            icon="icon-eye-open"
            iconAlign="left"
            value="viewAllParticipantsBtn"
            onClick="${viewAllParticipantsURL}"/>
