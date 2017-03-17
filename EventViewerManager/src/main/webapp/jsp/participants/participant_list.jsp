<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="es.eina.tfg.EventViewerManager.model.DTO.Participant" %>
<%@ page import="es.eina.tfg.EventViewerManager.model.ParticipantDisplayTerms" %>
<%@ page import="es.eina.tfg.EventViewerManager.model.ParticipantManager" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Event" %>
<%@ page import="java.util.List" %>
<%@include file="../custom_init.jsp"%>

<liferay-portlet:renderURL varImpl="participantsSearchURL">
    <portlet:param name="mvcPath" value="/jsp/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="${participantsSearchURL}" method="post" name="participantsForm">

    <liferay-portlet:renderURLParams varImpl="participantsSearchURL" />

    <liferay-portlet:renderURL varImpl="iteratorURL">
        <portlet:param name="mvcPath" value="/jsp/participants/participant_list.jsp" />
    </liferay-portlet:renderURL>

    <liferay-ui:search-container
            delta="10"
            hover="false"
            curParam="participantsCurParam"
            emptyResultsMessage="noparticipantsFound"
            displayTerms="<%= new ParticipantDisplayTerms(renderRequest) %>"
            iteratorURL="<%= iteratorURL %>" >

        <liferay-ui:search-container-results >
            <%
                Event requestedEvent = (Event) renderRequest.getAttribute(WebKeys.REQUESTED_EVENT);
                ParticipantDisplayTerms displayTerms = (ParticipantDisplayTerms) searchContainer.getDisplayTerms();

                displayTerms.setIdEvent(requestedEvent.getIdEvent());

                List<Participant> resultsSearch = ParticipantManager.getParticipantsByDisplayTerms(displayTerms,
                        searchContainer.getStart(), searchContainer.getEnd());
                int totalSearch = ParticipantManager.getParticipantsByDisplayTermsCount(displayTerms);

                searchContainer.setResults(resultsSearch);
                searchContainer.setTotal(totalSearch);


                if (Validator.isNull(requestedEvent)
                        && Validator.isNotNull(resultsSearch)
                        && resultsSearch.size()>0){
                    request.setAttribute(WebKeys.REQUESTED_EVENT, resultsSearch.get(0));
                }
            %>
        </liferay-ui:search-container-results>

        <liferay-ui:search-container-row
                className="es.eina.tfg.EventViewerManager.model.DTO.Participant"
                keyProperty="idUser"
                modelVar="aParticipant">
            <liferay-ui:search-container-column-text
                    property="participationNumber"
                    name="participationNumber"
                    orderable="false" />
            <liferay-ui:search-container-column-text
                    property="name"
                    name="name"
                    orderable="false" />
            <liferay-ui:search-container-column-jsp
                    path="/jsp/participants/participant_list_actions.jsp"
                    align="right" />
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator searchContainer="${searchContainer}" />
    </liferay-ui:search-container>
</aui:form>