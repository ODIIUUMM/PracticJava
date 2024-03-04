package org.example.forfeit;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
    public class Human {
    public List<Forfeit> ForfeitList;
    @Getter
    private String name;
    @Getter
    private String surname;
    @Getter
    private int age;

    private Human() {};

    public void addForfeit(Forfeit forfeit) {
        ForfeitList.add(forfeit);
    }

    public void removeForfeit(Forfeit forfeit) {
        if(ForfeitList.contains(forfeit)) {
            ForfeitList.remove(forfeit);
        } else {
            System.out.println("Этого штрафа нет");
        }
    }
}
