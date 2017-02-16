package es.eina.tfg.TrainingManager.model.converter;

import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.TrainingManager.model.DTO.FullcalendarEventResponse;

import static es.eina.tfg.TrainingManager.portlet.TrainingManager.YEAR_TO_DAY_DTFORMATTER;

public class FullcalendarConverter {

    public static FullcalendarEventResponse convert(Race toConvert,
                                                    String borderColor,
                                                    String backgroundColor,
                                                    String textColor,
                                                    String iconURL){
        FullcalendarEventResponse calendar = new FullcalendarEventResponse();
        calendar.setId(String.valueOf(toConvert.getIdRace()));

        calendar.setStart(YEAR_TO_DAY_DTFORMATTER.print(toConvert.getStartLocation().getTime()));
        calendar.setStart(YEAR_TO_DAY_DTFORMATTER.print(toConvert.getEndLocation().getTime()));
        calendar.setBorderColor(borderColor);
        calendar.setBackgroundColor(backgroundColor);
        calendar.setTextColor(textColor);
        calendar.setIconURL(iconURL);
        return calendar;
    }
}
