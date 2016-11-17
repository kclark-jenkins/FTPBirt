package org.krisbox.ihub.examples.utils;

public interface FTPBirtLogger {
    public void info(Object message);
    public void debug(Object message);
    public void warning(Object message);
    public void error(Object error);
    public void fatal(Object fatal);
}
