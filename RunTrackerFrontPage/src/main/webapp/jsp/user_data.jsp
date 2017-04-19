<%@include file="custom_init.jsp"%>

<h4 class="text-center">
    <liferay-ui:message key="userDataTitle" />
</h4>

<hr />

<portlet:actionURL name="updateUserDataAction" var="updateUserDataURL" />
<aui:form action="${updateUserDataURL}" method="post">
<table class="table table-condensed">
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="username" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <c:out value="${user.screenName}" />
        </td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="userHeight" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td><aui:input type="text"
                       maxLength="3"
                       name="${constants.PARAM_USER_HEIGHT}"
                       label=""
                       value="${requestScope.userAdditionalData.height}"
                       suffix="centimeters"
                       inlineField="true"
                       style="width: 50px;" />
        </td>
    </tr>
    <tr>
        <td class="text-right">
            <em>
                <liferay-ui:message key="userWeight" />:&nbsp;&nbsp;&nbsp;
            </em>
        </td>
        <td>
            <aui:input type="text"
                       maxLength="3"
                       name="${constants.PARAM_USER_WEIGHT}"
                       label=""
                       value="${requestScope.userAdditionalData.weight}"
                       suffix="kilograms"
                       inlineField="true"
                       style="width: 50px;" />
        </td>
    </tr>
    <tr>
        <td colspan="2" class="text-center">
            <aui:button name="addRouteBtn"
                        value="save"
                        type="submit"
                        cssClass="btn-success"
                        icon="icon-plus"
                        iconAlign="left"
            />
        </td>
    </tr>
</table>

</aui:form>

