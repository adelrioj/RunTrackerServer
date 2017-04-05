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
                        <%-- buttons --%>
                    <liferay-util:include page="/jsp/add/add_event_view_button.jsp"
                                          servletContext="${pageContext.servletContext}" />
                    <liferay-util:include page="/jsp/discover_view_button.jsp"
                                          servletContext="${pageContext.servletContext}" />
                    <br />
                    <br />
                    <liferay-util:include page="/jsp/calendar.jsp"
                                          servletContext="${pageContext.servletContext}" />
                </div>
                <div class="span7">
                    <c:choose>
                        <c:when test="${requestScope.requestedEvent.author.userId eq user.userId}" >
                            <div class="custom-hero-unit">
                                <liferay-util:include page="/jsp/eventDetail/event_detail_description_actions_admin.jsp"
                                                      servletContext="${pageContext.servletContext}" />
                            </div>
                            <hr />
                        </c:when>
                    </c:choose>
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

            <div class="row">
                <div class="span12">
                        <%-- buttons --%>
                    <liferay-util:include page="/jsp/add/add_event_view_button.jsp"
                                          servletContext="${pageContext.servletContext}" />
                    <liferay-util:include page="/jsp/discover_view_button.jsp"
                                          servletContext="${pageContext.servletContext}" />
                    <br />&nbsp;
                    <br />&nbsp;
                        <%-- detail --%>
                    <liferay-util:include page="/jsp/calendar.jsp"
                                          servletContext="${pageContext.servletContext}" />
                </div>
            </div>
        </div>
    </c:otherwise>
</c:choose>