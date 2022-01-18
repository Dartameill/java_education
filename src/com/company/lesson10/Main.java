package com.company.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 5, 10, 22, 15, 33, 44, 12, 10};
        System.out.println(Arrays.stream(number).min());
        System.out.println(Arrays.stream(number).max());
        System.out.println(Arrays.stream(number).skip(4));
        System.out.println(Arrays.stream(number));

    }

}
