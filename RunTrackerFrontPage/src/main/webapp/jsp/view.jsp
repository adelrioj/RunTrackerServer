<%@include file="custom_init.jsp"%>

<div class="container">
    <div class="row">
        <div class="span12">
            <liferay-ui:success key="${constants.MESSAGE_UPDATE_USERDATA_ACTION_SUCCESS}" message="messageUpdateUserdataActionSuccess" />
            <h1 class="text-center">
                <liferay-ui:message key="frontPageTitle" />
            </h1>
            <hr />
        </div>
    </div>
    <div class="row">
        <div class="span5">
            <liferay-util:include page="/jsp/user_data.jsp" servletContext="${pageContext.servletContext}" />
            <br />
            <br />
            <liferay-util:include page="/jsp/user_statistics.jsp" servletContext="${pageContext.servletContext}" />
        </div>
        <div class="span7">
            <liferay-util:include page="/jsp/last_routes.jsp" servletContext="${pageContext.servletContext}" />
        </div>
    </div>
</div>