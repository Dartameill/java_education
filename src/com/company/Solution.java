package com.company;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код



        while(true) {

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

        if (name.equals("exit")) {
            System.out.println("exit from system is start");
            break;
        } else if (name != "exit") {
            System.out.println("you write " + name);
            System.out.println("hi git");
            System.out.println("commit");
            System.out.println("sss");
        }
            }

        System.out.println("exit from system is complete");


}
}


