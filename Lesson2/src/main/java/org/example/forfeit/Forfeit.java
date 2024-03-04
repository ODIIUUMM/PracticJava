package org.example.forfeit;

import lombok.AllArgsConstructor;
import lombok.Getter;


enum TypesOfForfeit {
    PRAVO,
    ADMIN;
}


@AllArgsConstructor
public class Forfeit {
    @Getter
    private String description;
    @Getter
    private int sum;
    @Getter
    private String city;
    @Getter
    private String officer;
    @Getter
    private TypesOfForfeit types;


    private Forfeit() {};
}
