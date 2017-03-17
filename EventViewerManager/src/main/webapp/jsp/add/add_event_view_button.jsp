<%@include file="../custom_init.jsp"%>

<portlet:renderURL var="addEventURL">
    <portlet:param name="mvcPath" value="/jsp/add/add_event_form.jsp" />
</portlet:renderURL>
<aui:button name="addEventBtn"
            value="addEvent"
            onClick="${addEventURL}"
            cssClass="btn-info"
            icon="icon-plus"
            iconAlign="left"
/>

