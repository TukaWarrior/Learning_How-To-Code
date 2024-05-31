package com.example.Loigging;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.LogManager;


public class Main {
    public static final Logger LOG = System.getLogger(Main.class.getSimpleName());

    //public static final Logger LOG=System.getLogger(new Object(){}.getClass().getEnclosingClass().getName());
    public static void main(String[] args) throws SecurityException, IOException {
        LogManager logMgr = LogManager.getLogManager();
        //logMgr.readConfiguration(LoggingSystem.class.getClassLoader().getResourceAsStream("logging.properties"));
        LOG.log(Level.DEBUG, "debuging");
        LOG.log(Level.ERROR, "error");
        LOG.log(Level.INFO, "information");
        LOG.log(Level.TRACE, "tracing");
        LOG.log(Level.WARNING, "warning");
    }
}