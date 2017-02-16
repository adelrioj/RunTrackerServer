<%@include file="custom_init.jsp"%>

<liferay-ui:icon-menu>
    <!-- Delete section -->
    <portlet:actionURL name="deleteRaceAction" var="deleteRaceURL">
        <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedRace.idRace}" />
    </portlet:actionURL>
    <liferay-ui:icon-delete url="${deleteRaceURL}" />
</liferay-ui:icon-menu>