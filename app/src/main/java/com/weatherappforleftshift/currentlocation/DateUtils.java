package com.weatherappforleftshift.currentlocation;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Pankaj on 07-06-2017.
 */

public class DateUtils {

    public static String getFormattedDate(long val) {

        Date date = new Date(val);
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yy");
        String dateText = df2.format(date);

        return dateText;
    }
}
