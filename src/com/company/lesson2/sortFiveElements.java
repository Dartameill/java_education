package com.company.lesson2;

public class sortFiveElements {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 55, 900, 100};

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.println(min);
        }

    }
        }
