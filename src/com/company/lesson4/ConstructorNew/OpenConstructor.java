package com.company.lesson4.ConstructorNew;

public class OpenConstructor {
    public static void main(String[] args) {
        ConstrNew constr = new ConstrNew("Ivan", 14);
        ConstrNew constr2 = new ConstrNew("Hello", true);
        System.out.println(constr2.hello);
        System.out.println(constr.name);
    }
}
