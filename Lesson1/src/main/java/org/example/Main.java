package org.example;

import org.example.entities.EntitiesTypes;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
//        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int num = in.nextInt();
//        System.out.println("Введите процент");
//        int per = in.nextInt();
//        System.out.println("Ответ:" + (per*100)/num);

        //2
//        System.out.println("Введите первое число:");
//        String num1 = in.nextLine();
//        System.out.println("Введите второе число:");
//        String num2 = in.nextLine();
//        System.out.println("Введите третье число:");
//        String num3 = in.nextLine();
//        System.out.println(num1 + num2 + num3);

        //3
//        int arr[] = new int[6];
//        System.out.println("Введите число: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        int temp = arr[0];
//        int temp2 = arr[5];
//        arr[0] = temp2;
//        arr[5] = temp;
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

        //4
//        while (true) {
//            System.out.println("Введите номер месяца");
//            int num = in.nextInt();
//            if (num > 12 || num < 1) {
//                System.out.println("Ошибка");
//            } else {
//                if (num < 3 || num == 12) {
//                    System.out.println("winter");
//                }
//                if (num >= 3 && num <= 5) {
//                    System.out.println("Spring");
//                }
//                if (num > 5 && num <= 8) {
//                    System.out.println("Summer");
//                }
//                if (num > 8 && num <= 11) {
//                    System.out.println("Autumn");
//                }
//            }
        //}
        //5
//        System.out.println("Выберите тип конвертации \n 1. метры в мили \n 2. метры в дюймы \n 3. метры в ярды");
//        int num = in.nextInt();
//        System.out.println("Введите значение метры");
//        int metr = in.nextInt();
//        switch (num) {
//            case 1: {
//                System.out.println(metr * 0.000621371 + "mi");
//                break;
//            }
//            case 2: {
//                System.out.println(metr*39.37 + "in");
//                break;
//            }
//            case 3: {
//                System.out.println(metr * 1.094 + "yd");
//                break;
//            }
//            default: {
//                System.out.println("Error");
//            }
//        }

        //6
//        System.out.println("Введите диапазон:");
//        int min = in.nextInt();
//        int max = in.nextInt();
//        if (min > max) {
//            int temp1 = min;
//            int temp2 = max;
//            min = temp2;
//            max = temp1;
//        }
//        for (int i = min; i < max; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        //7
//        System.out.println("Введите число: ");
//        int num = in.nextInt();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(num + " * " + i + " = " + num * i + "\n");
//        }

        //8
//        int countMin = 0;
//        int countPlus = 0;
//        int countZero = 0;
//        int arr[] = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (-5 + Math.random() * 10);
//            System.out.println(arr[i]);
//            if(arr[i] < 0)
//                countMin++;
//            if(arr[i] > 0)
//                countPlus++;
//            if(arr[i] == 0)
//                countZero++;
//        }
//        System.out.println("Отрицательных: " + countMin + "\n Положительных: " + countPlus + "\n Ноль: " + countZero);



    }
}