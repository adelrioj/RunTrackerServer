<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="es.eina.tfg.EventViewerManager.model.DTO.Participant" %>
<%@ page import="es.eina.tfg.EventViewerManager.model.ParticipantDisplayTerms" %>
<%@ page import="es.eina.tfg.EventViewerManager.model.ParticipantManager" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Event" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.OrderByComparator" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="com.liferay.portlet.PortalPreferences" %>
<%@ page import="es.eina.tfg.RunTrackerBL.comparator.userAndEvent.UserAndEventOrderComparatorFactory" %>
<%@include file="../custom_init.jsp"%>

<liferay-portlet:renderURL varImpl="participantsSearchURL">
    <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
    <portlet:param name="mvcPath" value="/jsp/participants/view_participants.jsp" />
</liferay-portlet:renderURL>

<%
    String orderByCol = ParamUtil.getString(request, "orderByCol");
    String orderByType = ParamUtil.getString(request, "orderByType");

    PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request);

    if (Validator.isNotNull(orderByCol) && Validator.isNotNull(orderByType)) {
        portalPrefs.setValue("EVENT_SEARCH_PARTICIPANT_LIST", "participantList-order-by-col", orderByCol);
        portalPrefs.setValue("EVENT_SEARCH_PARTICIPANT_LIST", "participantList-order-by-type", orderByType);

    } else {
        orderByCol = portalPrefs.getValue("EVENT_SEARCH_PARTICIPANT_LIST", "participantList-order-by-col", UserAndEventOrderComparatorFactory.ORDER_BY_COL_PARTICIPATION_NUMBER);
        orderByType = portalPrefs.getValue("EVENT_SEARCH_PARTICIPANT_LIST", "participantList-order-by-type", UserAndEventOrderComparatorFactory.ORDER_BY_TYPE_ASC);
    }

    OrderByComparator orderByComparator = UserAndEventOrderComparatorFactory.getUserAndEventOrderByComparator(orderByCol, orderByType);
%>

<aui:form action="${participantsSearchURL}" method="post" name="participantsForm">

    <liferay-portlet:renderURLParams varImpl="participantsSearchURL" />

    <liferay-portlet:renderURL varImpl="iteratorURL">
        <portlet:param name="mvcPath" value="/jsp/participants/view_participants.jsp" />
        <portlet:param name="${constants.PARAM_EVENT_ID}" value="${requestScope.requestedEvent.idEvent}" />
    </liferay-portlet:renderURL>

    <liferay-ui:search-container
            delta="10"
            hover="false"
            curParam="participantsCurParam"
            emptyResultsMessage="noparticipantsFound"
            displayTerms="<%= new ParticipantDisplayTerms(renderRequest) %>"
            iteratorURL="<%= iteratorURL %>"
            orderByCol="<%= orderByCol %>"
            orderByType="<%= orderByType %>">

        <liferay-ui:search-form
                page="/jsp/participants/participant_list_search.jsp"
                servletContext="<%= application %>"
        />

        <liferay-ui:search-container-results >
            <%
                Event requestedEvent = (Event) renderRequest.getAttribute(WebKeys.REQUESTED_EVENT);
                ParticipantDisplayTerms displayTerms = (ParticipantDisplayTerms) searchContainer.getDisplayTerms();

                displayTerms.setIdEvent(requestedEvent.getIdEvent());

                List<Participant> resultsSearch = ParticipantManager.getParticipantsByDisplayTerms(displayTerms,
                        searchContainer.getStart(), searchContainer.getEnd(), orderByComparator);
                int totalSearch = ParticipantManager.getParticipantsByDisplayTermsCount(displayTerms);

                searchContainer.setResults(resultsSearch);
                searchContainer.setTotal(totalSearch);
            %>
        </liferay-ui:search-container-results>

        <liferay-ui:search-container-row
                className="es.eina.tfg.EventViewerManager.model.DTO.Participant"
                keyProperty="idUser"
                modelVar="aParticipant">
            <liferay-ui:search-container-column-text
                    property="participationNumber"
                    name="participationNumber"
                    orderable="true"
                    orderableProperty="participationNumber"/>
            <liferay-ui:search-container-column-text
                    property="name"
                    name="name"
                    orderable="false" />
            <c:choose>
                <c:when test="${empty requestScope.requestedEvent.realStartTime}">
                    <liferay-ui:search-container-column-jsp
                            path="/jsp/participants/participant_list_actions.jsp"
                            align="right" />
                </c:when>
            </c:choose>
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator searchContainer="${searchContainer}" />
    </liferay-ui:search-container>
</aui:form>