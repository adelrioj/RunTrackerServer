<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="es.eina.tfg.model.Route" %>
<%@ page import="es.eina.tfg.service.RouteLocalServiceUtil" %>
<%@include file="custom_init.jsp"%>

<%
  Long editRouteId;
  String infoRouteName = "";
  String infoRouteDescription = "";

  editRouteId = (Long) request.getAttribute(WebKeys.PARAM_SELECTEDROUTEID);
  if (Validator.isNotNull(editRouteId)){
    Route route = RouteLocalServiceUtil.getRoute(editRouteId);
    if (Validator.isNotNull(route)){
      infoRouteName = route.getName();
      infoRouteDescription = route.getDescription();
    }
  }
%>

<h1><liferay-ui:message key="routeName" />: <%= infoRouteName%></h1>
<h3><liferay-ui:message key="description" />: <%= infoRouteDescription%></h3>