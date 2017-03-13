<%@include file="custom_init.jsp"%>

<liferay-ui:success key="${constants.MESSAGE_ADD_EVENT_ACTION_SUCCESS}" message="messageAddEventActionSuccess" />
<liferay-ui:success key="${constants.MESSAGE_DELETE_EVENT_ACTION_SUCCESS}" message="messageDeleteEventActionSuccess" />

<div id="EventViewerManagerDiv">
    <c:choose>
        <c:when test="${not empty requestScope.requestedEvent}">
            <div id="calendarWrapperDiv">
                <liferay-util:include page="/jsp/calendar.jsp" servletContext="${pageContext.servletContext}" />
            </div>
            <div id="eventDetailDiv" >
                <div id="eventNameDiv" >
                    <liferay-util:include page="/jsp/eventDetail/event_detail_name.jsp" servletContext="${pageContext.servletContext}" />
                </div>
                <liferay-util:include page="/jsp/eventDetail/event_detail_map.jsp" servletContext="${pageContext.servletContext}" />
                <div id="eventDetailsDiv" >
                    <liferay-util:include page="/jsp/eventDetail/event_detail_description.jsp" servletContext="${pageContext.servletContext}" />
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <div id="calendarWrapperDivEmpty">
                <div id="emptyTitleDiv" >
                    <h1 align="center">
                        <liferay-ui:message key="noEventsFound" />
                    </h1>
                </div>
                <liferay-util:include page="/jsp/calendar.jsp" servletContext="${pageContext.servletContext}" />
            </div>
        </c:otherwise>
    </c:choose>
</div>