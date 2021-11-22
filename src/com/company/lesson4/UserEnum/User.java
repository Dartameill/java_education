package com.company.lesson4.UserEnum;

public class User {
    public static void main(String[] args) {
        UserData age = UserData.Age;
        UserData sex = UserData.Sex;
        UserData name = UserData.Name;

        System.out.println(age.AddAge());
        System.out.println(sex.Date("Ivan", "Ivanov"));
    }
}

