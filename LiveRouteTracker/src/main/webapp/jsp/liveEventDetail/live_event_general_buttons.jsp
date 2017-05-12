<%@include file="../custom_init.jsp"%>
<portlet:renderURL var="backToViewURL">
    <portlet:param name="mvcPath" value="/jsp/view.jsp" />
</portlet:renderURL>
<aui:button name="backBtn"
            value="backBtn"
            onClick="${backToViewURL}"
            cssClass="btn-info"
            icon="icon-arrow-left"
            iconAlign="left"
/>

<%--<portlet:actionURL name="addSampleDataAction" var="addSampleDataURL" >
    <portlet:param name="${constants.PARAM_SELECTED_IDEVENT}" value="${requestScope.selectedEvent.idEvent}" />
    <portlet:param name="mvcPath" value="/jsp/live_event_view.jsp" />
</portlet:actionURL>
<% if(permissionChecker.isOmniadmin()) {%>
<aui:button name="generateSampleBtn"
            value="generateSampleBtn"
            onClick="${addSampleDataURL}"
            cssClass="btn-inverse"
            icon="icon-flag"
            iconAlign="left"
/>
<% } %>--%>
