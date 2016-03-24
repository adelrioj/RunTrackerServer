<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="es.eina.tfg.model.Route" %>
<%@ page import="es.eina.tfg.service.RouteLocalServiceUtil" %>
<%@include file="custom_init.jsp"%>

<%
  Long editRouteId;
  String editRouteName = "";
  String editRouteDescription = "";

  editRouteId = (Long) request.getAttribute(WebKeys.PARAM_ROUTEID);
  if (Validator.isNotNull(editRouteId) || editRouteId!= 0){
    Route route = RouteLocalServiceUtil.getRoute(editRouteId);
    editRouteName = route.getName();
    editRouteDescription = route.getDescription();
  }
%>

<portlet:actionURL name="editRouteAction" var="editRouteURL" />

<aui:form action="${editRouteURL}" enctype="multipart/form-data" method="post">
  <aui:input type="file" name="importFile" label="" />
  <aui:input type="hidden" name="routeId" value="<%= editRouteId%>"/>
  <aui:input type="text" name="routeName" label="route-name" maxLength="255" value="<%= editRouteName%>">
    <aui:validator name="required" errorMessage="error-name-required" />
  </aui:input>
  <aui:input type="textarea" name="routeDescription" label="description" maxLength="255" value="<%= editRouteDescription%>">
    <aui:validator name="required" errorMessage="error-desc-required" />
  </aui:input>
  <aui:select name="routeType" id="routeType" inlineField="true" label="route-type">
    <aui:option value="RUNNING" selected="true"><liferay-ui:message key="type-running" /></aui:option>
    <aui:option value="CYCLING" ><liferay-ui:message key="type-cycling" /></aui:option>
  </aui:select>
  <aui:input type="checkbox" name="isPublic" value="true" label="route-is-public"/>
  <aui:button name="editRouteBtn" value="save" type="submit" />
</aui:form>