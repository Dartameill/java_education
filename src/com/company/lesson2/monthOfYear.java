package com.company.lesson2;

import java.util.Scanner;

public class monthOfYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();

        if (month.equals("Декабрь")  || month.equals("Январь") || month.equals("Февраль")) {
            System.out.println("Зима");
        } else if (month.equals("Март") || month.equals("Апрель") || month.equals("Май")) {
            System.out.println("Весна");
        } else if (month.equals("Июнь") || month.equals("Июль") || month.equals("Август")) {
            System.out.println("Лето");
        } else if (month.equals("Сентябрь") || month.equals("Октябрь") || month.equals("Ноябрь")) {
            System.out.println("Осень");
        } else {
            System.out.println("Такого месяца не существует, проверьте правильность ввода");
        }
    }
}
