<%@ page import="es.eina.tfg.RunTrackerBL.entity.Race" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@include file="custom_init.jsp"%>

<%
    Race requestedRace = (Race) request.getAttribute(WebKeys.REQUESTED_RACE);
    Date startLocationTime = requestedRace.getStartLocation().getTime().toDate();
%>

<h1>
    <c:choose>
        <c:when test="${not empty requestScope.requestedRace.route.name}" >
            <c:out value="${requestScope.requestedRace.route.name}" />
        </c:when>
        <c:otherwise>
            <liferay-ui:message key="raceDefaultTitle" />
        </c:otherwise>
    </c:choose>
    &nbsp;
    <fmt:formatDate type="both" dateStyle="short" value="<%= startLocationTime%>" />
</h1>