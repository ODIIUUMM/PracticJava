package org.example;

public class SumArray implements Runnable{
    Object locker;

    public SumArray(Object locker) {
        this.locker = locker;
    }
    @Override
    public void run() {
        synchronized (locker) {
            try {
                locker.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("управление принято");
            for(int i = 0; i < Main.arr.length; i++) {
                System.out.println(Main.arr[i]);
            }

        }
    }
}
