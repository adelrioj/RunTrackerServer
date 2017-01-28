<%@ page import="es.eina.tfg.DeviceManager.model.DeviceDisplayTerms" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Device" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="es.eina.tfg.DeviceManager.portlet.DeviceManager" %>
<%@include file="custom_init.jsp"%>

<liferay-portlet:renderURL varImpl="deviceListSearchURL">
    <portlet:param name="mvcPath" value="/jsp/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="${deviceListSearchURL}" method="post" name="DeviceListForm">

    <liferay-portlet:renderURLParams varImpl="deviceListSearchURL" />

    <liferay-portlet:renderURL varImpl="iteratorURL">
        <portlet:param name="mvcPath" value="/jsp/view.jsp" />
    </liferay-portlet:renderURL>

    <liferay-ui:search-container
            delta="10"
            hover="false"
            curParam="deviceListCurParam"
            emptyResultsMessage="noDevicesFound"
            displayTerms="<%= new DeviceDisplayTerms(renderRequest) %>"
            iteratorURL="<%= iteratorURL %>" >

        <liferay-ui:search-container-results >
            <%
                DeviceDisplayTerms displayTerms = (DeviceDisplayTerms) searchContainer.getDisplayTerms();

                List<Device> resultsSearch = DeviceManager.getDeviceByDisplayTerms(displayTerms,
                        searchContainer.getStart(), searchContainer.getEnd());
                int totalSearch = DeviceManager.getDeviceByDisplayTermsCount(displayTerms);

                searchContainer.setResults(resultsSearch);
                searchContainer.setTotal(totalSearch);

                Device alreadySelectedDevice = (Device) renderRequest.getAttribute(WebKeys.PARAM_SELECTED_DEVICE);
                if (Validator.isNull(alreadySelectedDevice)
                        && Validator.isNotNull(resultsSearch)
                        && resultsSearch.size()>0){
                    request.setAttribute(WebKeys.PARAM_SELECTED_DEVICE, resultsSearch.get(0));
                }
            %>
        </liferay-ui:search-container-results>

        <liferay-ui:search-container-row
                className="es.eina.tfg.RunTrackerBL.entity.Device"
                keyProperty="idDevice"
                modelVar="aDevice">
            <liferay-ui:search-container-column-text
                    property="deviceUUID"
                    name="deviceUUID"
                    orderable="false" />
            <liferay-ui:search-container-column-text
                    property="description"
                    name="description"
                    orderable="false" />
            <liferay-ui:search-container-column-text
                    property="status"
                    name="status"
                    orderable="false" />
            <liferay-ui:search-container-column-jsp
                    path="/jsp/device_list_actions.jsp"
                    align="right" />
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator searchContainer="${searchContainer}" />
    </liferay-ui:search-container>
</aui:form>