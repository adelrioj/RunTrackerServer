<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="es.eina.tfg.RouteViewer.model.compare.RouteNameComparator" %>
<%@ page import="es.eina.tfg.service.RouteLocalServiceUtil" %>
<%@include file="custom_init.jsp"%>

<liferay-portlet:renderURL varImpl="routeListSearchURL">
    <portlet:param name="mvcPath" value="/jsp/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="${routeListSearchURL}" method="get" name="RouteListForm">
    <liferay-portlet:renderURLParams varImpl="routeListSearchURL" />
    <liferay-portlet:renderURL varImpl="iteratorURL">
        <portlet:param name="routeId" value="${requestScope.routeId}" />
        <portlet:param name="mvcPath" value="/jsp/view.jsp" />
    </liferay-portlet:renderURL>

    <liferay-ui:search-container
            delta="10"
            hover="false"
            curParam="routeListCurParam"
            emptyResultsMessage="noRoutesFound"
            displayTerms="<%= new DisplayTerms(renderRequest) %>"
            iteratorURL="<%= iteratorURL %>" >

        <liferay-ui:search-form
                page="/jsp/route_list_search.jsp"
                servletContext="<%= application %>"
                />
        <liferay-ui:search-container-results >
            <%
                DisplayTerms displayTerms =searchContainer.getDisplayTerms();
                String searchkeywords = displayTerms.getKeywords();
                searchContainer.setResults(
                        RouteLocalServiceUtil.getRoutesByName(
                                searchkeywords,
                                searchContainer.getStart(),
                                searchContainer.getEnd(),
                                new RouteNameComparator()));
                searchContainer.setTotal(
                        RouteLocalServiceUtil.getRoutesByNameCount(searchkeywords));
            %>
        </liferay-ui:search-container-results>

        <liferay-ui:search-container-row
                className="es.eina.tfg.model.Route"
                keyProperty="routeId"
                modelVar="aRoute">
            <liferay-ui:search-container-column-text
                    property="name"
                    name="name"
                    orderableProperty="name"
                    orderable="true" />
            <liferay-ui:search-container-column-text
                    property="description"
                    name="description"
                    orderableProperty="description"
                    orderable="true" />
            <liferay-ui:search-container-column-jsp
                    path="/jsp/route_list_actions.jsp"
                    align="right" />
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator searchContainer="${searchContainer}" />
    </liferay-ui:search-container>
</aui:form>
