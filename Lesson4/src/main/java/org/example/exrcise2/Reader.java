package org.example.exrcise2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;

public class Reader implements Runnable{
    private final StreamLocker streamLocker;

    public Reader(StreamLocker streamLocker) {
        this.streamLocker = streamLocker;
    }


    @Override
    public void run() {
        synchronized (streamLocker) {
            try {
                streamLocker.wait();
                handler();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void handler() {
        int count = 0;
        try ( FileReader fileReader = new FileReader(streamLocker.MainFile)) {
            int c;
            while((c = fileReader.read())!=-1){
                count += c;
                System.out.println(c);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new FileWriter("result.txt")) {
            fileWriter.write(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }



