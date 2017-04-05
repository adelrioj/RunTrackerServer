<%@include file="custom_init.jsp"%>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <liferay-ui:success key="${constants.MESSAGE_DELETE_DEVICE_ACTION_SUCCESS}" message="messageDeleteDeviceActionSuccess" />
            <h1 class="text-center">
                <liferay-ui:message key="devicesTitle" />
            </h1>

            <hr />
        </div>
    </div>
    <div class="row-fluid">
        <div class="span5">
            <liferay-util:include page="/jsp/device_list.jsp" servletContext="${pageContext.servletContext}" />
        </div>
        <div class="span7">
            <liferay-util:include page="/jsp/selected_device_details.jsp" servletContext="${pageContext.servletContext}" />
        </div>
    </div>
</div>