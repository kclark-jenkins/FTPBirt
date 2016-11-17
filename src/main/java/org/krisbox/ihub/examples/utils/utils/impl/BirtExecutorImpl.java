package org.krisbox.ihub.examples.utils.utils.impl;

import org.krisbox.ihub.examples.utils.BirtExecutor;
import java.io.File;

public class BirtExecutorImpl extends ClassPropertiesImpl implements BirtExecutor {
    public BirtExecutorImpl() {
        super();
    }

    public File renderReport(String username, String volume, String password, String hostname, String reportdesign, String outputname) {
        // Use IDAPI Wrapper to render report here
        info("Implement me");

        return null;
    }
}
