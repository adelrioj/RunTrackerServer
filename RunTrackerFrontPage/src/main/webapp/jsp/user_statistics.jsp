<%@include file="custom_init.jsp"%>

<h4 class="text-center">
    <liferay-ui:message key="userStatisticsTitle" />
</h4>

<hr />

<table class="table table-condensed">
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="createdRoutes" />:
            </em>
        </td>
        <td>
            <c:out value="${requestScope.myAddedRoutes}" />
        </td>
        <td>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="trainingsRunned" />:
            </em>
        </td>
        <td>
            <c:out value="${requestScope.myTrainings}" />
        </td>
        <td>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="eventsCreated" />:
            </em>
        </td>
        <td>
            <c:out value="${requestScope.myAddedEvents}" />
        </td>
        <td>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="eventsRunned" />:
            </em>
        </td>
        <td>
            <c:out value="${requestScope.myParticipatedEvents}" />
        </td>
        <td>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
    </tr>
</table>