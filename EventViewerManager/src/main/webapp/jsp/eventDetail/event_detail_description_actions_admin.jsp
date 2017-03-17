<%@include file="../custom_init.jsp"%>

<h4>
    <liferay-ui:message key="adminOptions" />
</h4>

<table align="center">
    <tr>
        <td>
            <c:choose>
                <c:when test="${empty requestScope.requestedEvent.realStartTime}" >
                    <portlet:actionURL var="startEventURL" name="startEventAction">
                        <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
                    </portlet:actionURL>
                    <aui:button type="submit"
                                cssClass="btn-info"
                                icon="icon-play-circle"
                                iconAlign="left"
                                value="start.event"
                                onClick="${startEventURL}"/>
                </c:when>
                <c:when test="${not empty requestScope.requestedEvent.realStartTime && empty requestScope.requestedEvent.realFinishTime}" >
                    <portlet:actionURL var="startEventURL" name="startEventAction">
                        <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
                    </portlet:actionURL>
                    <aui:button type="submit"
                                cssClass="btn-info"
                                icon="icon-play-circle"
                                iconAlign="left"
                                value="end.event"
                                onClick="${startEventURL}"/>
                </c:when>
            </c:choose>
        </td>
        <td>
            <portlet:renderURL var="showParticipantsURL">
                <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
                <portlet:param name="mvcPath" value="/jsp/participants/view_participants.jsp" />
            </portlet:renderURL>
            <aui:button type="submit"
                        cssClass="btn-info"
                        icon="icon-user"
                        iconAlign="left"
                        value="showParticipants"
                        onClick="${showParticipantsURL}" />
        </td>
    </tr>
</table>