package org.example.forfeit;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Base {
    public List<Human> humanList;
    private int count;

    public Base() {
        humanList = new ArrayList<>();
    }

    public void printBase() {
        humanList.forEach(human -> {
            System.out.println("Name: " + human.getName() + " " + human.getSurname() + " age " + human.getAge() + "\n");
            human.ForfeitList.forEach(forfeit -> {
                System.out.println("description" + forfeit.getDescription() + " sum " + forfeit.getSum() + " city " + forfeit.getCity() + " officer " + forfeit.getOfficer() + " type " + forfeit.getTypes());
            });

        });
    }

}
