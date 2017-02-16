<%@include file="custom_init.jsp"%>

<portlet:renderURL var="renderURL" />

<portlet:resourceURL var="getMonthEventsURL" >
    <portlet:param name="${constants.PARAM_RESOURCEREQUEST_TYPE}" value="${constants.PARAM_RESOURCEREQUEST_GET_MONTH_EVENTS}" />
</portlet:resourceURL>

<script type="text/javascript">

    $(function() { // document ready
        $('#calendar').fullCalendar({
            schedulerLicenseKey: 'CC-Attribution-NonCommercial-NoDerivatives',
            locale: '<%= themeDisplay.getLocale()%>',
            now: '${requestScope.today}',
            editable: false, // enable draggable events
            aspectRatio: 1.8,
            scrollTime: '00:00', // undo default 6am scrollTime
            header: {
                left: 'today prev,next',
                center: '',
                right: 'title'
            },
            defaultView: 'month',
            events: function(start, end, timezone, callback) {
                $.ajax({
                    url: '${getMonthEventsURL}',
                    type: 'POST',
                    dataType: 'json',
                    data: {
                        <portlet:namespace />start: start.format("YYYY-MM-DD"),
                        <portlet:namespace />end: end.format("YYYY-MM-DD")
                    },
                    success: function(doc) {
                        var events = [];
                        $(doc).each(function() {
                            events.push({
                                id: $(this).attr('id'),
                                title: 'title',
                                start: $(this).attr('start'),
                                end: $(this).attr('end'),
                                borderColor: $(this).attr('borderColor'),
                                textColor: $(this).attr('textColor'),
                                color: $(this).attr('backgroundColor'),
                                iconURL: $(this).attr('iconURL')
                            });
                        });
                        callback(events);
                    }
                });
            },
            eventRender: function(event, eventElement) {
                if (event.iconURL) {
                    eventElement.find("div.fc-content").prepend("<img src='" + event.iconURL +"' width='24' height='24'>");
                }
            },
            eventClick: function(calEvent, jsEvent, view) {
                window.location = '${renderURL}' + '&<portlet:namespace/>${constants.PARAM_EVENT_ID}=' + calEvent.id;
            },
            dayRender: function (date, cell) {
                var dateFormatted = $.fullCalendar.moment(date).format('YYYY-MM-DD');
                if (dateFormatted.localeCompare('${requestScope.today}')) {
                    cell.css("background-color", "white");
                } else {
                    cell.css("background-color", "lightgray");
                }
            }
        });

        <c:if test="${not empty requestScope.requestedRace}" >
            $('#calendar').fullCalendar('gotoDate', '${requestScope.requestedRace.startLocation.time}');
        </c:if>
    });


</script>

<div id='calendar'></div>