<%@include file="custom_init.jsp"%>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <h1 class="text-center">
                <liferay-ui:message key="liveTitle" />: <c:out value="${requestScope.selectedEvent.name}" />
            </h1>
            <hr />
        </div>
    </div>
    <div class="row-fluid" >
        <div class="span5">
            <liferay-util:include page="/jsp/liveEventDetail/live_event_general_buttons.jsp" servletContext="${pageContext.servletContext}" />
            <br />
            <br />
            <liferay-util:include page="/jsp/liveEventDetail/live_event_participant_list.jsp" servletContext="${pageContext.servletContext}" />
        </div>
        <div class="span7">
            <liferay-util:include page="/jsp/liveEventDetail/live_event_map.jsp" servletContext="${pageContext.servletContext}" />
            <br />
            <br />
            <liferay-util:include page="/jsp/liveEventDetail/live_event_description.jsp" servletContext="${pageContext.servletContext}" />
        </div>
    </div>
</div>