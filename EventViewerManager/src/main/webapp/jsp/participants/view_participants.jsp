<%@include file="../custom_init.jsp"%>

<div id="participantDiv" class="center-div">

    <liferay-ui:success key="${constants.MESSAGE_DELETE_PARTICIPANT_ACTION_SUCCESS}" message="messageDeleteParticipantActionSuccess" />

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

    <div id="eventNameDiv">
        <h1>
            <c:out value="${requestScope.requestedEvent.name}" />:&nbsp;
            <liferay-ui:message key="participantsTitle" />
        </h1>
    </div>
    <br/>
    <br/>
    <liferay-util:include page="/jsp/participants/participant_list.jsp" servletContext="${pageContext.servletContext}" />
</div>