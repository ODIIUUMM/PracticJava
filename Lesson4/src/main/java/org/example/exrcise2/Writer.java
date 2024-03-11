package org.example.exrcise2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Writer implements Runnable{
    private final StreamLocker streamLocker;
    private final Random random;

    public Writer(StreamLocker streamLocker) {
        this.streamLocker = streamLocker;
        this.random = new Random();
    }


    @Override
    public void run() {
        synchronized (streamLocker) {
            handler();
            streamLocker.notify();
            try {
                streamLocker.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void handler() {
        try ( FileWriter fileWriter = new FileWriter(streamLocker.MainFile)) {
            System.out.println(streamLocker.MainFile.getPath());
            for(int i = 0; i < 10; i++)
            {
                fileWriter.write(random.nextInt(15) +5);
            }
            System.out.println("Я записал");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

    }



