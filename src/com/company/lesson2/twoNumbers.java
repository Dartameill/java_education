package com.company.lesson2;

import java.util.Scanner;

public class twoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for(int a = 0; a <= num1; a++) {
            for (int c = 0; c <= num2; c++) {
                if (a % 3 == 0 && c % 3 == 0) {
                    sum1 = sum1 + a;
                    sum2 = sum2 + c;
                }
            }
            System.out.println(sum1 + " " + sum2);
        }




        }


    }

