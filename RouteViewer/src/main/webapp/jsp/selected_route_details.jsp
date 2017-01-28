<%@include file="custom_init.jsp"%>

<table>
    <tr>
        <td align="right">
            <em>
            <liferay-ui:message key="description" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.routeToEdit.description}" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="type" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${requestScope.routeToEdit.type}" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="routeDistance" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <fmt:formatNumber type="number"
                              maxFractionDigits="2"
                              value="${requestScope.routeToEdit.distanceInMeters / 1000}"
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
                              value="${requestScope.routeToEdit.maxElevationDifference}"
            />
            <liferay-ui:message key="meters" />
        </td>
    </tr>
    <tr>
        <td align="right">
            <em>
                <liferay-ui:message key="start" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/green-dot.png" />
        </td>
        <td align="right">
            <em>
                <liferay-ui:message key="end" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td align="left">
            <img src="${pageContext.request.contextPath}/images/yellow-dot.png" />
        </td>
    </tr>
</table>