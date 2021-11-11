package com.company.lesson2;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        while(true) {

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

        if (name.equals("exit")) {
            System.out.println("exit from system is start");
            break;
        } else if (name != "exit") {
            System.out.println("you write " + name);
        }
            }
        System.out.println("exit from system is complete");


}
}


