<%@include file="../custom_init.jsp"%>

<portlet:actionURL name="addParticipationEventAction" var="addParticipationEventURL">
    <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
</portlet:actionURL>
<aui:button name="addParticipationBtn" value="addParticipation" icon="icon-plus" onClick="${addParticipationEventURL}" cssClass="btn-info"/>