package ru.gb.utils;

import java.sql.Timestamp;

public class FileName {
    public static String getFilename() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.toString().replace(":", "-");
    }
}
