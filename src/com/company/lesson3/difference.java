package com.company.lesson3;

public class difference {

    public static void main(String[] args) {
        int[] diff = new int[]{1, 25, 20, 50, 24, 98};
        int sum = 0;
        int sum1 = 0;

        for(int i = 0; i < diff.length; ++i) {
            if (i % 2 == 0) {
                sum += diff[i];
            } else {
                sum1 += diff[i];
            }
        }

        System.out.println(sum);
        System.out.println(sum1);
    }
}