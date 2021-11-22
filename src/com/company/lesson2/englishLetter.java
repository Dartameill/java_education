package com.company.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class englishLetter {
    public static void main(String[] args) {
        String[] a;
        a = new String[]{"e", "y", "u", "i", "o", "a"};
        String[] b;
        b = new String[]{"q", "w", "r", "t", "p", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};

        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();

        if(Arrays.asList(a).contains(enter)) {
            System.out.println("Гласная");
        } else if (Arrays.asList(b).contains(enter)) {
            System.out.println("Согласная");
        }
    }
}
