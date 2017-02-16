<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Route" %>
<%@ page import="es.eina.tfg.RouteDiscoverManager.model.RouteDisplayTerms" %>
<%@ page import="es.eina.tfg.RouteDiscoverManager.portlet.RouteManager" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@include file="custom_init.jsp"%>

<liferay-portlet:renderURL varImpl="routeDiscoverListSearchURL">
    <portlet:param name="mvcPath" value="/jsp/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="${routeDiscoverListSearchURL}" method="post" name="RouteDiscoverListForm">

    <liferay-portlet:renderURLParams varImpl="routeDiscoverListSearchURL" />

    <liferay-portlet:renderURL varImpl="iteratorURL">
        <portlet:param name="mvcPath" value="/jsp/view.jsp" />
    </liferay-portlet:renderURL>

    <liferay-ui:search-container
            delta="10"
            hover="false"
            curParam="routeDiscoverListCurParam"
            emptyResultsMessage="noRoutesFound"
            displayTerms="<%= new RouteDisplayTerms(renderRequest) %>"
            iteratorURL="<%= iteratorURL %>" >

        <liferay-ui:search-form
                page="/jsp/route_list_search.jsp"
                servletContext="<%= application %>"
        />

        <liferay-ui:search-container-results >
            <%
                RouteDisplayTerms displayTerms = (RouteDisplayTerms) searchContainer.getDisplayTerms();

                List<Route> resultsSearch = RouteManager.getRouteByDisplayTerms(displayTerms,
                        searchContainer.getStart(), searchContainer.getEnd());
                int totalSearch = RouteManager.getRouteByDisplayTermsCount(displayTerms);

                searchContainer.setResults(resultsSearch);
                searchContainer.setTotal(totalSearch);

                Route alreadySelectedRoute = (Route) renderRequest.getAttribute(WebKeys.PARAM_ROUTE_TO_EDIT);
                if (Validator.isNull(alreadySelectedRoute)
                        && Validator.isNotNull(resultsSearch)
                        && resultsSearch.size()>0){
                    request.setAttribute(WebKeys.PARAM_ROUTE_TO_EDIT, resultsSearch.get(0));
                }
            %>
        </liferay-ui:search-container-results>

        <liferay-ui:search-container-row
                className="es.eina.tfg.RunTrackerBL.entity.Route"
                keyProperty="idRoute"
                modelVar="aRoute">
            <liferay-ui:search-container-column-text
                    property="name"
                    name="name"
                    orderable="false" />
            <liferay-ui:search-container-column-text
                    property="description"
                    name="description"
                    orderable="false" />
            <liferay-ui:search-container-column-text
                    property="type"
                    name="type"
                    orderable="false" />
            <liferay-ui:search-container-column-jsp
                    path="/jsp/route_list_actions.jsp"
                    align="right" />
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator searchContainer="${searchContainer}" />
    </liferay-ui:search-container>
</aui:form>
