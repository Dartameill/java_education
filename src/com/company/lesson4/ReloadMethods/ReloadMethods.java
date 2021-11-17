package com.company.lesson4.ReloadMethods;

public class ReloadMethods {

    public void printName(String name) {
        System.out.println(name);
    }

    public void printName(String name, String surname) {
        System.out.println(name + " " + surname);
     }

     public void printName(String name, String surname, boolean isMan) {
         System.out.println(name + " " + surname + " Я мужского пола " + isMan);
     }
}
