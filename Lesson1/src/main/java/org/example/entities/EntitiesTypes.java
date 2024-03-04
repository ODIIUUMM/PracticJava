package org.example.entities;

public class EntitiesTypes implements Runnable {
    @Override
    public void run() {
        User user = new User();
        System.out.println(user);
    }
}
