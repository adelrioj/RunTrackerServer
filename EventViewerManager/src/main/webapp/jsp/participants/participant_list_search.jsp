<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@include file="../custom_init.jsp"%>
<%
    SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
    DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle
        buttonLabel="participantListSearch"
        displayTerms="<%= displayTerms %>"
        id="toggle_id_participant_list_search">
    <aui:input label="name" name="name" value="${requestScope.name}" />
</liferay-ui:search-toggle>
