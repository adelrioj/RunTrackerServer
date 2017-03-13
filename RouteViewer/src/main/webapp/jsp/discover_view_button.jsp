<%@include file="custom_init.jsp"%>

<portlet:actionURL name="redirectToDiscoverAction" var="redirectToDiscoverUrl">
</portlet:actionURL>

<aui:button cssClass="btn-info"
            icon="icon-share"
            iconAlign="left"
            value="discoverRoutes"
            onClick="${redirectToDiscoverUrl}"/>