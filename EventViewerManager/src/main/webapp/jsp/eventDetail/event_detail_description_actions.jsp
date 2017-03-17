<%@include file="../custom_init.jsp"%>

<portlet:actionURL name="deleteParticipationEventAction" var="deleteEventURL">
    <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
</portlet:actionURL>

<aui:button type="submit"
            cssClass="btn-danger"
            icon="icon-remove"
            iconAlign="left"
            value="deleteEvent"
            onClick="${deleteEventURL}"/>