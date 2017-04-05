<%@include file="custom_init.jsp"%>

<liferay-ui:success key="${constants.MESSAGE_ADD_EVENT_ACTION_SUCCESS}" message="messageAddEventActionSuccess" />
<liferay-ui:success key="${constants.MESSAGE_DELETE_EVENT_ACTION_SUCCESS}" message="messageDeleteEventActionSuccess" />

<c:choose>
    <c:when test="${not empty requestScope.requestedEvent}">
        <div class="container-fluid">
                <%-- title --%>
            <div class="row-fluid">
                <div class="span12">
                    <h1 class="text-center">
                        <c:out value="${requestScope.requestedEvent.name}" />
                    </h1>
                    <hr />
                </div>
            </div>

                <%-- detail --%>
            <div class="row-fluid" >
                <div class="span5">
                    <liferay-util:include page="/jsp/calendar.jsp"
                                          servletContext="${pageContext.servletContext}" />
                </div>
                <div class="span7">
                    <liferay-util:include page="/jsp/eventDetail/event_detail_map.jsp"
                                          servletContext="${pageContext.servletContext}" />
                    <br />
                    <liferay-util:include page="/jsp/eventDetail/event_detail_description.jsp"
                                          servletContext="${pageContext.servletContext}" />
                </div>
            </div>
        </div>
    </c:when>
    <c:otherwise>
        <div class="container">
                <%-- title --%>
            <div class="row">
                <div class="span12">
                    <h1 class="text-center">
                        <liferay-ui:message key="noEventsFound" />
                    </h1>
                    <hr />
                </div>
            </div>
                <%-- detail --%>
            <div class="row">
                <div class="span12">
                    <liferay-util:include page="/jsp/calendar.jsp"
                                          servletContext="${pageContext.servletContext}" />
                </div>
            </div>
        </div>
    </c:otherwise>
</c:choose>