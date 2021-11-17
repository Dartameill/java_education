package com.company.lesson4.ReloadMethods;

public class UseReloadMethods {

    public static void main(String[] args) {
        ReloadMethods reload = new ReloadMethods();

        reload.printName("Denis");
        reload.printName("Denis", "Denisov");
        reload.printName("Denis" , "Denisov", true);
    }


}
