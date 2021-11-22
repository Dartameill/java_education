package com.company.lesson3;

import java.util.Arrays;

public class fewNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 6, 6, 5, 2, 2, 100};
        Arrays.sort(array);
        int prev = array[0];
        int popular = array[0];
        int count = 1;
        int maxCount = 1;

        for(int i = 1; i < array.length; ++i) {
            if (array[i] == prev) {
                ++count;
            } else {
                if (count > maxCount) {
                    popular = array[i - 1];
                    maxCount = count;
                }

                prev = array[i];
                count = 1;
            }
        }

        System.out.println("Число " + popular + " Встречается " + maxCount + " раза");
    }
}
