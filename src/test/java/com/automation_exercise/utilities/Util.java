package com.automation_exercise.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String generateCurrentDateAndTime() {
        return new SimpleDateFormat("ddMMyyyyHHmmssSSS").format(new Date());
    }
}
