<%@include file="custom_init.jsp"%>

<portlet:actionURL name="deleteRaceAction" var="deleteRaceURL">
    <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedRace.idRace}" />
</portlet:actionURL>

<aui:button type="submit"
            cssClass="btn-danger"
            icon="icon-remove"
            iconAlign="left"
            value="deleteTraining"
            onClick="${deleteRaceURL}"/>