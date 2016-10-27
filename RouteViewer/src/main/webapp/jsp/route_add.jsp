<%@include file="custom_init.jsp"%>

<portlet:renderURL var="addRouteURL">
  <portlet:param name="mvcPath" value="/jsp/route_add_form.jsp" />
</portlet:renderURL>
<aui:button name="addRouteBtn" value="addRoute" onClick="${addRouteURL}" />
