<%@include file="custom_init.jsp"%>

<portlet:actionURL name="addRouteAction" var="addRouteURL" />
<div class="flexCentered" >
    <aui:form action="${addRouteURL}" enctype="multipart/form-data" method="post">
        <aui:input type="file" name="${constants.PARAM_ROUTE_IMPORT_FILE_NAME}" label="" />
        <aui:input type="hidden" name="${constants.PARAM_ROUTEID}" value=""/>
        <aui:input type="text" name="${constants.PARAM_ROUTENAME}" label="route-name" maxLength="255" value="">
            <aui:validator name="required" errorMessage="error-name-required" />
        </aui:input>
        <aui:input type="textarea" name="${constants.PARAM_ROUTEDESC}" label="description" maxLength="255" value="">
            <aui:validator name="required" errorMessage="error-desc-required" />
        </aui:input>
        <aui:select name="${constants.PARAM_ROUTETYPE}" id="routeType" inlineField="true" label="route-type">
            <aui:option value="${constants.TYPE_RUNNING}" selected="true"><liferay-ui:message key="type-running" /></aui:option>
            <aui:option value="${constants.TYPE_CYCLING}" ><liferay-ui:message key="type-cycling" /></aui:option>
        </aui:select>
        <aui:input type="checkbox" name="${constants.PARAM_ISPUBLIC}" value="true" label="route-is-public"/>
        <div class="align-right" >
            <portlet:renderURL var="backToViewURL">
                <portlet:param name="mvcPath" value="/jsp/view.jsp" />
            </portlet:renderURL>
            <aui:button name="backBtn"
                        value="backBtn"
                        onClick="${backToViewURL}"
                        cssClass="btn-info"
                        icon="icon-arrow-left"
                        iconAlign="left"
            />
            <aui:button name="addRouteBtn"
                        value="save"
                        type="submit"
                        cssClass="btn-success"
                        icon="icon-plus"
                        iconAlign="left"
            />
        </div>
    </aui:form>
</div>