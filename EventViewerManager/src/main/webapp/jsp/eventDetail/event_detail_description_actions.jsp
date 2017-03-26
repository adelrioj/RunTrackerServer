<%@include file="../custom_init.jsp"%>

<c:choose>
    <c:when test="${empty requestScope.requestedEvent.realStartTime}">
        <portlet:actionURL name="deleteParticipationEventAction" var="deleteEventURL">
            <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
        </portlet:actionURL>

        <aui:button type="submit"
                    cssClass="btn-danger"
                    icon="icon-remove"
                    iconAlign="left"
                    value="deleteEvent"
                    onClick="${deleteEventURL}"/>
    </c:when>
</c:choose>
