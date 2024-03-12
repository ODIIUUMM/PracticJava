package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


// Является ли год високосным========================================
        Predicate<Integer> isYear = x ->{
            if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(isYear.test(2004));



        //Вернуть день недели от даты=================================
        Date date;
        date = (x) -> {
          return  x.getDayOfWeek();
        };
        LocalDate date2 = LocalDate.now();
        System.out.println(date.work(date2));


// Лямбды как параметр методов
        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<Integer> isNegative = x -> x < 0;
        Predicate<Integer> isEquals = (x) -> x == 5;
        Predicate<Integer> isRange = (n) -> n > 5 && n < 10;
        int[] arr = new int[] {1, -2, 3, -4, 5,6,-7};
        System.out.println(funcArray(arr, isEquals));


        //минимум максимум из четырех
        Four<Integer> min = (x1, x2, x3, x4) -> {
            int num = x1;
            if(num > x2)
                num = x2;
            if(num > x3)
                num = x3;
            if(num > x4)
                num = x4;
            return num;
        };

        Four<Integer> max = (x1, x2, x3, x4) -> {
            int num = x1;
            if(num < x2)
                num = x2;
            if(num < x3)
                num = x3;
            if(num < x4)
                num = x4;
            return num;
        };

        System.out.println(max.apply(5, 6, 3, 1));

    }


    public static int funcArray(int arr[], Predicate lambda) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(lambda.test(arr[i]))
                count += arr[1];
        }
        return count;
    }



    interface Date {
        DayOfWeek work(LocalDate date);
    }

    public interface Predicate<T> {
        boolean test(T t);
    }
    public interface Four<T> {
        Integer apply(T t1, T t2,T t3, T t4);
    }
}