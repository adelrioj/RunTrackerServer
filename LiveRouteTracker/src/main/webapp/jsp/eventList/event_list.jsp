<%@ page import="com.liferay.portal.kernel.util.OrderByComparator" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portlet.PortalPreferences" %>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Event" %>
<%@ page import="es.eina.tfg.RunTrackerBL.util.UserUtils" %>
<%@ page import="es.eina.tfg.liveRouteTracker.model.DTO.EventDisplayTerms" %>
<%@ page import="es.eina.tfg.liveRouteTracker.model.EventManager" %>
<%@ page import="es.eina.tfg.liveRouteTracker.util.EventOrderByComparatorFactory" %>
<%@ page import="org.joda.time.format.DateTimeFormat" %>
<%@ page import="org.joda.time.format.DateTimeFormatter" %>
<%@ page import="java.util.List" %>
<%@include file="../custom_init.jsp"%>

<liferay-portlet:renderURL varImpl="eventListSearchURL">
    <portlet:param name="mvcPath" value="/jsp/view.jsp" />
</liferay-portlet:renderURL>

<%
    DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy hh:mm:ss");
%>

<%
    String orderByCol = ParamUtil.getString(request, "orderByCol");
    String orderByType = ParamUtil.getString(request, "orderByType");

    PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request);

    if (Validator.isNotNull(orderByCol) && Validator.isNotNull(orderByType)) {
        portalPrefs.setValue("KK_3", "kk-order-by-col", orderByCol);
        portalPrefs.setValue("KK_3", "kk-order-by-type", orderByType);

    } else {
        orderByCol = portalPrefs.getValue("KK_3", "kk-order-by-col", EventOrderByComparatorFactory.ORDER_BY_COL_PLANNED_START_TIME);
        orderByType = portalPrefs.getValue("KK_3", "kk-order-by-type", EventOrderByComparatorFactory.ORDER_BY_TYPE_ASC);
    }

    OrderByComparator orderByComparator = EventOrderByComparatorFactory.getEventOrderByComparator(orderByCol, orderByType);
%>

<aui:form action="${eventListSearchURL}" method="post" name="EventListForm">

    <liferay-portlet:renderURLParams varImpl="eventListSearchURL" />

    <liferay-portlet:renderURL varImpl="iteratorURL">
        <portlet:param name="mvcPath" value="/jsp/view.jsp" />
    </liferay-portlet:renderURL>

    <liferay-ui:search-container
            delta="10"
            hover="false"
            curParam="eventListCurParam"
            emptyResultsMessage="noEventsFound"
            displayTerms="<%= new EventDisplayTerms(renderRequest) %>"
            iteratorURL="<%= iteratorURL %>"
            orderByCol="<%= orderByCol %>"
            orderByType="<%= orderByType %>">

        <liferay-ui:search-form
                page="/jsp/eventList/event_list_search.jsp"
                servletContext="<%= application %>"
        />

        <liferay-ui:search-container-results >
            <%
                EventDisplayTerms displayTerms = (EventDisplayTerms) searchContainer.getDisplayTerms();
                displayTerms.setUser(UserUtils.getCurrentUser(renderRequest));

                List<Event> resultsSearch = EventManager.getLiveEventsByDisplayTerms(
                        displayTerms, searchContainer.getStart(), searchContainer.getEnd(), orderByComparator);
                int totalSearch = EventManager.getLiveEventsByDisplayTermsCount(displayTerms);

                searchContainer.setResults(resultsSearch);
                searchContainer.setTotal(totalSearch);
            %>
        </liferay-ui:search-container-results>

        <liferay-ui:search-container-row
                className="es.eina.tfg.RunTrackerBL.entity.Event"
                keyProperty="idEvent"
                modelVar="aEvent">
            <liferay-ui:search-container-column-text
                    property="name"
                    name="name"
                    orderable="true"
                    orderableProperty="name"/>
            <liferay-ui:search-container-column-text
                    name="scPlannedStartTimeName"
                    value="<%= fmt.print(aEvent.getPlannedStartTime())%>"
                    orderable="true"
                    orderableProperty="plannedStartTime" />
            <liferay-ui:search-container-column-text
                    name="scPlannedFinishTimeName"
                    value="<%= fmt.print(aEvent.getPlannedFinishTime())%>"
                    orderable="false" />
            <liferay-ui:search-container-column-text
                    name="scRealStartTimeName"
                    value="<%= fmt.print(aEvent.getRealFinishTime())%>"
                    orderable="false" />
            <liferay-ui:search-container-column-jsp
                    path="/jsp/eventList/event_list_actions.jsp"
                    align="right" />
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator searchContainer="${searchContainer}" />
    </liferay-ui:search-container>
</aui:form>
