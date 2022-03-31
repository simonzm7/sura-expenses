package com.sura.expenses.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final String DATE_PATTERN = "dd/MM/yyyy";

    public static Date toDate(String dateString) throws  Exception{
        return new SimpleDateFormat(DATE_PATTERN).parse(dateString);
    }

}
