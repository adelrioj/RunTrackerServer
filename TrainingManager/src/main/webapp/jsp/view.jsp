<%@include file="custom_init.jsp"%>

<liferay-ui:success key="${constants.MESSAGE_DELETE_ACTION_SUCCESS}" message="messageDeleteActionSuccess" />

<div id="trainingManagerDiv">
    <c:choose>
        <c:when test="${not empty requestScope.requestedRace}">
            <div id="calendarWrapperDiv">
                <liferay-util:include page="/jsp/calendar.jsp" servletContext="${pageContext.servletContext}" />
            </div>
            <div id="trainingDetailDiv" >
                <div id="trainingNameDiv" >
                    <liferay-util:include page="/jsp/training_detail_name.jsp" servletContext="${pageContext.servletContext}" />
                </div>
                <div id="trainingMapDiv" >
                    <liferay-util:include page="/jsp/training_detail_map.jsp" servletContext="${pageContext.servletContext}" />
                </div>
                <div id="trainingDetailsDiv" class="flexCentered">
                    <liferay-util:include page="/jsp/training_detail_description.jsp" servletContext="${pageContext.servletContext}" />
                </div>
            </div>
        </c:when>
        <c:otherwise>

            <portlet:actionURL name="addSampleDataAction" var="addSampleDataURL" />
            <aui:button name="addRouteBtn" value="addSampleData" onClick="${addSampleDataURL}" />

            <div id="calendarWrapperDivEmpty">
                <div id="emptyTitleDiv" >
                    <h1 align="center">
                        <liferay-ui:message key="noRacesFound" />
                    </h1>
                </div>
                <liferay-util:include page="/jsp/calendar.jsp" servletContext="${pageContext.servletContext}" />
            </div>
        </c:otherwise>
    </c:choose>
</div>