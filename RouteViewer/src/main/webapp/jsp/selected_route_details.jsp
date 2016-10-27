<%@include file="custom_init.jsp"%>

<h1><liferay-ui:message key="routeName" />: <c:out value="${requestScope.routeToEdit.name}" /></h1>
<h3><liferay-ui:message key="description" />: <c:out value="${requestScope.routeToEdit.description}" /></h3>