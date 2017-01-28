<%@include file="custom_init.jsp"%>

<div id="DeviceManagerDiv">
    <div id="DeviceListDiv">
        <liferay-util:include page="/jsp/device_list.jsp" servletContext="${pageContext.servletContext}" />
    </div>
    <div id="DeviceDetailDiv">
        <liferay-util:include page="/jsp/selected_device_details.jsp" servletContext="${pageContext.servletContext}" />
    </div>
</div>