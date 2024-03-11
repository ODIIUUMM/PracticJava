package org.example.exrcise2;

import java.io.BufferedReader;
import java.io.File;

public class StreamLocker {
    File MainFile;
    public StreamLocker(String filePath) {
        this.MainFile = new File(filePath);
    }
}
