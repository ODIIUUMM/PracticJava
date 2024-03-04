package org.example;

public class Random implements Runnable {
    Object locker;

    public Random(Object locker) {
        this.locker = locker;

    }

    @Override
    public void run() {
        synchronized (locker) {
            for (int i = 0; i < Main.arr.length; i++) {
                Main.arr[i] = (int)Math.random()*10;
            }
            try {
                locker.notifyAll();
                locker.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        }
    }
