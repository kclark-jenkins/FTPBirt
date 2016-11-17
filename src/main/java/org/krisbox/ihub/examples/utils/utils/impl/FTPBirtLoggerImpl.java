package org.krisbox.ihub.examples.utils.utils.impl;

import org.apache.log4j.Logger;
import org.krisbox.ihub.examples.utils.FTPBirtLogger;

public class FTPBirtLoggerImpl implements FTPBirtLogger {
    final static Logger LOGGER = Logger.getLogger(FTPBirtLoggerImpl.class);

    public FTPBirtLoggerImpl() {
    }

    public void debug(Object message){
        LOGGER.debug(message);
    }

    public void info(Object message){
        LOGGER.info(message);
    }

    public void warning(Object message){
        LOGGER.warn(message);
    }

    public void error(Object message){
        LOGGER.error(message);
    }

    public void fatal(Object message){
        LOGGER.fatal(message);
    }
}
