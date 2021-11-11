package com.company.lesson3;

public class fibonnachi {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 0;
        arr[1] = 1;

        int i;
        for(i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

    }
}
