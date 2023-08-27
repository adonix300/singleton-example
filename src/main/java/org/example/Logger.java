package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    Date currentDate = new Date();
    private static Logger instance;
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + dateFormat.format(currentDate) + " " + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }


}
