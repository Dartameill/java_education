package com.company.lesson4.UserEnum;

import java.util.Scanner;

public enum UserData {
    Name("name1", "surname"),
    Age(14),
    Sex(true);


  public String name;
  public int age;
  public boolean sex;
  public String surname;

    UserData(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    UserData(int age) {
        this.age = age;
    }

    UserData(boolean sex) {
        this.sex = sex;
    }


    public String Date(String name, String surname) {
        this.name = name;
        this.surname = surname;
        return name + " " +  surname;
    }
    public int AddAge() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        number++;
        return number;
    }

    public void UserInfo(String name, String surname, int age, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;

    }
}
