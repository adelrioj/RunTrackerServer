<%@include file="../custom_init.jsp"%>

<div class="row-fluid">
    <div class="span12">
        <h4 class="text-center">
            <liferay-ui:message key="adminOptions" />
        </h4>
    </div>
</div>

<div class="row-fluid">
    <div class="span2 offset4">
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
                <portlet:actionURL var="finishEventURL" name="finishEventAction">
                    <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
                </portlet:actionURL>
                <aui:button type="submit"
                            cssClass="btn-info"
                            icon="icon-play-circle"
                            iconAlign="left"
                            value="end.event"
                            onClick="${finishEventURL}"/>
            </c:when>
        </c:choose>
    </div>
    <div class="span2">
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
    </div>
</div>