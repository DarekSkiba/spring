package com.kodilla.patterns.singleton;

public final class Logger {

    private static Logger logger = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getLastLog() {
        if (logger == null) {
            synchronized(Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return lastLog;
    }


    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}