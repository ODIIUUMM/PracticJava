package org.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //1==============================================
        System.out.println("Hello world!");
        ArrayLocker arrayLocker = new ArrayLocker();
        FillArray fillArray = new FillArray(arrayLocker);
        SumArray sumArray = new SumArray(arrayLocker);
        Thread t1 = new Thread(fillArray);
        Thread t2 = new Thread(sumArray);
        t2.start();
        t1.start();
        //1==============================================

        //2==============================================
    }
}