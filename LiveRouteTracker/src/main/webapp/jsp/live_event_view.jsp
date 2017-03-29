<%@include file="custom_init.jsp"%>

<div id="liveEventDiv" class="center-div">
    <portlet:renderURL var="backToViewURL">
        <portlet:param name="mvcPath" value="/jsp/view.jsp" />
    </portlet:renderURL>
    <aui:button name="backBtn"
                value="backBtn"
                onClick="${backToViewURL}"
                cssClass="btn-info"
                icon="icon-arrow-left"
                iconAlign="left"
    />
    <portlet:actionURL name="addSampleDataAction" var="addSampleDataURL" >
        <portlet:param name="${constants.PARAM_SELECTED_IDEVENT}" value="${requestScope.selectedEvent.idEvent}" />
        <portlet:param name="mvcPath" value="/jsp/live_event_view.jsp" />
    </portlet:actionURL>
    <% if(permissionChecker.isOmniadmin()) {%>
        <aui:button name="generateSampleBtn"
                    value="generateSampleBtn"
                    onClick="${addSampleDataURL}"
                    cssClass="btn-inverse"
                    icon="icon-flag"
                    iconAlign="left"
        />
    <% } %>

    <br />
    <liferay-util:include page="/jsp/liveEventDetail/live_event_map.jsp" servletContext="${pageContext.servletContext}" />
    <br />
    <liferay-util:include page="/jsp/liveEventDetail/live_event_participant_list.jsp" servletContext="${pageContext.servletContext}" />
</div>