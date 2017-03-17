<%@include file="../custom_init.jsp"%>

<portlet:actionURL name="addEventAction" var="addEventURL" />

<div id="addEventFormDiv" class="center-div" >

    <aui:form action="${addEventURL}" enctype="multipart/form-data" method="post">
        <aui:input type="text" name="${constants.PARAM_ADDEVENT_NAME}" label="add-event-name"
                   maxLength="255" style="width:100%" >
            <aui:validator name="required" errorMessage="error-name-required" />
        </aui:input>


        <div class="aui-field-content" id="#<portlet:namespace />startDatePicker">
            <aui:input id="startDate" name="${constants.PARAM_ADDEVENT_STARTDATE}"
                       type="text" label="add-event-startDate" style="width:100%" >
                <aui:validator name="required" errorMessage="error-startdate-required" />
            </aui:input>
        </div>
        <div class="aui-field-content" id="#<portlet:namespace />startTimePicker">
            <aui:input id="startTime" name="${constants.PARAM_ADDEVENT_STARTHOUR}"
                       type="text" label="add-event-startTime" >

            </aui:input>
        </div>

        <div class="aui-field-content" id="#<portlet:namespace />endDatePicker">
            <aui:input id="endDate" name="${constants.PARAM_ADDEVENT_ENDDATE}"
                       type="text" label="add-event-endDate" style="width:100%" >
                <aui:validator name="required" errorMessage="error-enddate-required" />
            </aui:input>
        </div>
        <div class="aui-field-content" id="#<portlet:namespace />endTimePicker">
            <aui:input id="startTime" name="${constants.PARAM_ADDEVENT_ENDHOUR}"
                       type="text" label="add-event-endTime" >

            </aui:input>
        </div>


        <aui:select name="${constants.PARAM_ADDEVENT_IDROUTE}" label="add-event-route" required="true" >
            <c:forEach var="route" items="${requestScope.addEventRouteList}">
                <aui:option label="${route.name}" value="${route.idRoute}" />
            </c:forEach>
        </aui:select>

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
            <aui:button name="addEventBtn"
                        value="save"
                        type="submit"
                        cssClass="btn-success"
                        icon="icon-plus"
                        iconAlign="left"
            />
        </div>
    </aui:form>

</div>


<script type="text/javascript" charset="utf-8">
    AUI().ready('alloy-node','aui-form-validator', 'aui-overlay-context-panel', 'aui-datepicker', function(A) {

        var startDate = new A.DatePicker({
            trigger: '#<portlet:namespace />startDate',
            mask: '${constants.ADDEVENT_DATE_FORMAT_PERCENT}',
            popover: {zIndex: 10},
            yearRange: [2017, (new Date).getFullYear()]
        });

        var endDate = new A.DatePicker({
            trigger: '#<portlet:namespace />endDate',
            mask: '${constants.ADDEVENT_DATE_FORMAT_PERCENT}',
            popover: {zIndex: 10},
            yearRange: [2017, (new Date).getFullYear()]
        });
    });

    AUI().use('aui-timepicker', function(A) {
        new A.TimePicker({
            trigger : '#<portlet:namespace/>startTime',
            mask:'%H:%M',
            popover : {zIndex : 1}
        });
    });
</script>
