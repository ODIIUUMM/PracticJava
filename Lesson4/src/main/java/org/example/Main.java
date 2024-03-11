package org.example;

import org.example.exrcise2.Reader;
import org.example.exrcise2.StreamLocker;
import org.example.exrcise2.Writer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //1==============================================
//        System.out.println("Hello world!");
//        ArrayLocker arrayLocker = new ArrayLocker();
//        FillArray fillArray = new FillArray(arrayLocker);
//        SumArray sumArray = new SumArray(arrayLocker);
//        Thread t1 = new Thread(fillArray);
//        Thread t2 = new Thread(sumArray);
//        t2.start();
//        t1.start();
        //1==============================================

        //2==============================================
        StreamLocker streamLocker= new StreamLocker("test.txt");
        Reader reader = new Reader(streamLocker);
        Writer writer = new Writer(streamLocker);
        Thread t2 = new Thread(writer);
        Thread t1 = new Thread(reader);
        t1.start();
        t2.start();

    }
}