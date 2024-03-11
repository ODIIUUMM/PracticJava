package org.example;

import java.util.ArrayList;

public class SumArray implements Runnable{
    private final ArrayLocker data;

    public SumArray(ArrayLocker data) {
        this.data = data;
    }
    @Override
    public void run() {
        synchronized (data) {
            try {
                data.wait();
                handler();
            } catch (InterruptedException e) {

            }

        }
    }

    private void handler() {
        int count = 0;
        ArrayList<Integer> temp = data.getData();
        for(int i = 0; i < temp.size(); i++) {
            count += temp.get(i);
            System.out.println(temp.get(i));
        }
        System.out.println(count + "its count");
    }
}
