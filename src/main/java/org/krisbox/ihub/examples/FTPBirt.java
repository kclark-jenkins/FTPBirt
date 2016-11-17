package org.krisbox.ihub.examples;

import org.krisbox.ihub.examples.utils.utils.impl.FTPUploadImpl;

public class FTPBirt extends FTPUploadImpl {
    public FTPBirt(String rptdesign, String outputname) {
        renderThenUpload(rptdesign, outputname);
    }

    public static void main(String[] args) {
        new FTPBirt("reportDesign.rptdesign", "myOutput.pdf");
    }
}
