<%@include file="custom_init.jsp"%>

<div id="liveEventDiv" class="center-div">
    <div id="listWrapperDiv" >
        <liferay-util:include page="/jsp/liveEventDetail/live_event_general_buttons.jsp" servletContext="${pageContext.servletContext}" />
        <br />
        <br />
        <liferay-util:include page="/jsp/liveEventDetail/live_event_participant_list.jsp" servletContext="${pageContext.servletContext}" />
    </div>
    <div id="eventDetailDiv" >
        <div id="liveEventTitleDiv" class="title-div">
            <liferay-util:include page="/jsp/liveEventDetail/live_event_title.jsp" servletContext="${pageContext.servletContext}" />
        </div>
        <liferay-util:include page="/jsp/liveEventDetail/live_event_map.jsp" servletContext="${pageContext.servletContext}" />
        <div id="eventDescriptionDiv">
            <liferay-util:include page="/jsp/liveEventDetail/live_event_description.jsp" servletContext="${pageContext.servletContext}" />
        </div>
    </div>
</div>