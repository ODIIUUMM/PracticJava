package org.example;

public class Main {
    public static int arr[] = new int[10];
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        Object locker;
        locker = new Object();
        arr[0] = 11;
        Random r = new Random(locker);
        SumArray sum = new SumArray(locker);
        Thread t2 = new Thread(sum);
        Thread t1 = new Thread(r);
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.run();
        t2.run();
    }
}