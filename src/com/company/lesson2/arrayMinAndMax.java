package com.company.lesson2;

public class arrayMinAndMax {
    public static void main(String[] args) {
        int[] value = new int[]{2, 5, 10, 22, 40, 1, 0, 4, 900, 100};
        int min;
        int max;
        min = max = value[0];

        for (int i = 1; i < 10; i++) {
            if(value[i] < min) {
                min = value[i];
            }
            if (value[i] > max) {
                max = value[i];
            }

        }  System.out.println(min);
        System.out.println(max);

    }


}
