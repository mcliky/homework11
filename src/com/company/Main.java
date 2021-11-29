package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();


    }

    private static void task1() {
        Person one = new Person("John", "Wick", 34, 84.25, 174);
        System.out.println(one.getAge());
        PersonInfo a = new PersonInfo();
        a.createList();
        a.printList();

    }

    private static void task2() {
        Random rand = new Random();
        int[][] arr = new int[4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
        Matrix a = new Matrix();
        a.print(arr);
        a.swapRows(arr, 0, 3);
        a.print(arr);
        a.swapColumns(arr, 0, 1);
        a.print(arr);
        a.mul(arr, 2);
        a.print(arr);
        System.out.println(Arrays.toString(a.toArray(arr)));
        System.out.println(a.max(arr));


    }


}
