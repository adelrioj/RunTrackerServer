<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@include file="custom_init.jsp"%>
<%
    SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
    DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle
        buttonLabel="deviceListSearch"
        displayTerms="<%= displayTerms %>"
        id="toggle_id_device_list_search">
    <aui:input label="deviceDescriptionSearch" name="deviceDescriptionSearch" value="${requestScope.deviceDescriptionSearch}" />
</liferay-ui:search-toggle>