package com.company.lesson4.ConstructorNew;

public class ConstrNew {

    public String name;
    public int age;
    public String hello;
    public boolean choose;

    ConstrNew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ConstrNew(String hello, boolean choose) {
        this.hello = hello;
        this.choose = choose;
    }
}
