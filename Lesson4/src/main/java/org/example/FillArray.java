package org.example;

import java.util.ArrayList;
import java.util.Random;

public class FillArray implements Runnable {
    private final ArrayLocker data;
    private final Random random;

    public FillArray(ArrayLocker data) {
        this.data = data;
        this.random = new Random();

    }

    @Override
    public void run() {
        synchronized (data) {
           handler();
           data.notifyAll();
           try {
               data.wait();
           } catch (InterruptedException e) {

           }

        }


        }

        private void handler() {
            int size = random.nextInt(5) + 5;
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                temp.add(random.nextInt(15) +5);
            }
            data.setData(temp);
            System.out.println("i am fill already");
        }
    }
