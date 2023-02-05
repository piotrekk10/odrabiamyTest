package org.odrabiamy.utils;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UniqueIdUtils {
    public static int getUniqueId(){
        Format formatter = new SimpleDateFormat("HHmmss");
        Date date = new Date();
        return Integer.parseInt(formatter.format(date));
    }
}
