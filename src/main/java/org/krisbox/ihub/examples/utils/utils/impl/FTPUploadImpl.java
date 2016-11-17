package org.krisbox.ihub.examples.utils.utils.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.krisbox.ihub.examples.utils.FTPUpload;

public class FTPUploadImpl extends BirtExecutorImpl implements FTPUpload {
    public FTPUploadImpl() {
        super();
    }

    public boolean renderThenUpload(String rptdesign, String output) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect((String)getProperty("ftpHostname"), (Integer)getProperty("ftpPort"));
            ftpClient.login((String)getProperty("ftpUsername"), (String)getProperty("ftpPassword"));
            ftpClient.enterLocalPassiveMode();

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            File firstLocalFile = renderReport((String)getProperty("ihubUsername"),
                    (String)getProperty("ihubVolume"),
                    (String)getProperty("ihubPassword"),
                    (String)getProperty("ihubHost"),
                    rptdesign,
                    output);

            InputStream inputStream = new FileInputStream(firstLocalFile);

            info("Start uploading first file");
            boolean done = ftpClient.storeFile(output, inputStream);
            inputStream.close();
            if (done) {
                info(output + " uploaded successfully.");
            }
        } catch (IOException ex) {
            fatal(ex);
            return false;
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                fatal(ex);
                return false;
            }
        }
        return true;
    }
}
