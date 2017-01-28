<%@include file="custom_init.jsp"%>
<div class="title" >
    <h4>
        <c:out value="${requestScope.selectedDevice.description}" />
    </h4>
</div>
<div class="props" >
    <table>
        <tr>
            <td align="right">
                <em><liferay-ui:message key="status" /></em>:&nbsp;&nbsp;&nbsp;
            </td>
            <td>
                <c:out value="${requestScope.selectedDevice.status}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <em><liferay-ui:message key="UUID" /></em>:&nbsp;&nbsp;&nbsp;
            </td>
            <td>
                <c:out value="${requestScope.selectedDevice.deviceUUID}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <em><liferay-ui:message key="phoneNumber" /></em>:&nbsp;&nbsp;&nbsp;
            </td>
            <td>
                <c:out value="${requestScope.selectedDevice.phoneNumber}" />
            </td>
        </tr>
    </table>
</div>
<div class="title" >
    <h5>
        <liferay-ui:message key="sensorTitle" />
    </h5>
</div>
<c:forEach items="${requestScope.selectedDevice.sensors}" var="deviceAndSensor">
    <div class="props" >
        <table id="sensorTable">
            <tr>
                <td align="right">
                    <em>
                        <liferay-ui:message key="sensorType" />:&nbsp;&nbsp;&nbsp;
                    </em>
                </td>
                <td>
                    <c:out value="${deviceAndSensor.sensor.description}" />
                </td>
            </tr><tr>
            <td align="right">
                <em>
                    <liferay-ui:message key="status" />:&nbsp;&nbsp;&nbsp;
                </em>
            </td>
            <td>
                <c:choose>
                    <c:when test="${deviceAndSensor.status eq true}">
                        <liferay-ui:message key="deviceOnline" />
                    </c:when>
                    <c:otherwise>
                        <liferay-ui:message key="deviceOffline" />
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
        </table>
    </div>
</c:forEach>