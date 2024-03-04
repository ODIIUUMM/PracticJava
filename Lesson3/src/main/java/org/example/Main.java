package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Year year;
        year = (x) -> {
            if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(year.work(1700));

        Date date;
        date = (x) -> {
          return  x.getDayOfWeek();
        };
        LocalDate date2 = LocalDate.now();
        System.out.println(date.work(date2));

    }


    interface Year {
        boolean work(int year);
    }

    interface Date {
        DayOfWeek work(LocalDate date);
    }
}