package org.krisbox.ihub.examples.utils;

import java.io.File;

public interface BirtExecutor extends ClassProperties {
    public File renderReport(String username, String volume, String password, String hostname, String reportdesign, String outputname);
}
