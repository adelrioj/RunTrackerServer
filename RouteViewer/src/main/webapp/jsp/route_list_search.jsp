<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@include file="custom_init.jsp"%>
<%
  SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
  DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle
        buttonLabel="routeListSearch"
        displayTerms="<%= displayTerms %>"
        id="toggle_id_route_list_search">
  <aui:input label="routeName" name="routeName" value="${routeName}" />
</liferay-ui:search-toggle>