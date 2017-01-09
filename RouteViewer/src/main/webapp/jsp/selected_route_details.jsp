<%@include file="custom_init.jsp"%>

<h4>
    <c:out value="${requestScope.routeToEdit.description}" />
</h4>
<h4>
    <liferay-ui:message key="routeDistance" />:
    <fmt:formatNumber type="number"
                      maxFractionDigits="2"
                      value="${requestScope.routeToEdit.distanceInMeters / 1000}"
    />
    <liferay-ui:message key="kilometers" />
</h4>
<h4>
    <liferay-ui:message key="elevationDifference" />:
    <fmt:formatNumber type="number"
                      maxFractionDigits="2"
                      value="${requestScope.routeToEdit.maxElevationDifference}"
    />
    <liferay-ui:message key="meters" />
</h4>