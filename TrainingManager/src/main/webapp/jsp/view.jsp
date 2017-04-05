<%@include file="custom_init.jsp"%>

<liferay-ui:success key="${constants.MESSAGE_DELETE_ACTION_SUCCESS}" message="messageDeleteActionSuccess" />

<c:choose>
    <c:when test="${not empty requestScope.requestedRace}">
        <div class="container-fluid">
                <%-- title --%>
            <div class="row-fluid">
                <div class="span12">
                    <liferay-util:include page="/jsp/training_detail_name.jsp" servletContext="${pageContext.servletContext}" />
                    <hr />
                </div>
            </div>

            <div class="row-fluid" >
                <div class="span5">
                    <liferay-util:include page="/jsp/calendar.jsp" servletContext="${pageContext.servletContext}" />
                </div>
                <div class="span7">
                    <liferay-util:include page="/jsp/training_detail_map.jsp" servletContext="${pageContext.servletContext}" />
                    <br />
                    <liferay-util:include page="/jsp/training_detail_description.jsp" servletContext="${pageContext.servletContext}" />
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
                        <liferay-ui:message key="noRacesFound" />
                    </h1>
                    <hr />
                </div>
            </div>

                <%-- detail --%>
            <div class="row">
                <div class="span12">
                    <portlet:actionURL name="addSampleDataAction" var="addSampleDataURL" />
                    <aui:button name="addRouteBtn" value="addSampleData" onClick="${addSampleDataURL}" />
                    <br />&nbsp;
                    <br />&nbsp;
                    <liferay-util:include page="/jsp/calendar.jsp"
                                          servletContext="${pageContext.servletContext}" />
                </div>
            </div>
        </div>
    </c:otherwise>
</c:choose>
