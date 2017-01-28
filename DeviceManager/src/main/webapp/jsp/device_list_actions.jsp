<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Device" %>
<%@include file="custom_init.jsp"%>

<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Device device = (Device)row.getObject();
%>
<liferay-ui:icon-menu>
    <!-- View section -->
    <portlet:renderURL var="viewDeviceURL">
        <portlet:param name="${constants.PARAM_ID_DEVICE}" value="<%= String.valueOf(device.getIdDevice()) %>" />
    </portlet:renderURL>
    <liferay-ui:icon image="view" message="view" url="${viewDeviceURL}" />
    <!-- Delete section -->
    <portlet:actionURL name="deleteDeviceAction" var="deleteDeviceURL">
        <portlet:param name="${constants.PARAM_ID_DEVICE}" value="<%= String.valueOf(device.getIdDevice()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete url="${deleteDeviceURL}" />
</liferay-ui:icon-menu>