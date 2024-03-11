package org.example;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ArrayLocker {
    private ArrayList<Integer> data = new ArrayList<>();
}
