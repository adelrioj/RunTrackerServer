<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="es.eina.tfg.RunTrackerBL.entity.Race" %>
<%@ page import="java.util.Date" %>
<%@include file="custom_init.jsp"%>

<%
    Race requestedRace = (Race) request.getAttribute(WebKeys.REQUESTED_RACE);
    Date startLocationTime = requestedRace.getStartLocation().getTime().toDate();
    Date endLocationTime = requestedRace.getEndLocation().getTime().toDate();
%>

<table>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="raceStartingTime" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatDate type="both" dateStyle="short" value="<%= startLocationTime%>" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="raceFinishTime" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatDate type="both" dateStyle="short" value="<%= endLocationTime%>" />
        </td>
        <td align="right">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <liferay-util:include page="/jsp/training_detail_description_actions.jsp" servletContext="${pageContext.servletContext}" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="type" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.requestedRace.type}" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="routeName" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.requestedRace.route.name}" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="raceDistance" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatNumber type="number"
                              maxFractionDigits="2"
                              value="${requestScope.requestedRace.distanceInMeters / 1000}"
            />
            <liferay-ui:message key="kilometers" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="routeDistance" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatNumber type="number"
                              maxFractionDigits="2"
                              value="${requestScope.requestedRace.route.distanceInMeters / 1000}"
            />
            <liferay-ui:message key="kilometers" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="elevationDifference" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatNumber type="number"
                              maxFractionDigits="2"
                              value="${requestScope.requestedRace.maxElevationDifference}"
            />
            <liferay-ui:message key="meters" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="race.start" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/green-dot.png" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="race.end" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/yellow-dot.png" />
        </td>
    </tr>
</table>
