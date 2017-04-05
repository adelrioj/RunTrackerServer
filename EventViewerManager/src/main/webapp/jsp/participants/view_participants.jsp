<%@include file="../custom_init.jsp"%>

<div class="container">

    <liferay-ui:success key="${constants.MESSAGE_DELETE_PARTICIPANT_ACTION_SUCCESS}" message="messageDeleteParticipantActionSuccess" />

    <div class="row">
        <div class="span12">
            <h1 class="text-center">
                <c:out value="${requestScope.requestedEvent.name}" />:&nbsp;<liferay-ui:message key="participantsTitle" />
            </h1>
            <hr />
        </div>
    </div>
    <div class="row">
        <div class="span2">
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
            <br>&nbsp;
        </div>
    </div>
    <div class="row">
        <div class="span12">
            <liferay-util:include page="/jsp/participants/participant_list.jsp" servletContext="${pageContext.servletContext}" />
        </div>
    </div>
</div>