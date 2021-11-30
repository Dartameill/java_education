package com.company.lesson5;

public class Director {

    public int count = 0;

    public void addWorker(int count) {
        count++;
        System.out.println("New employee is added");
    }



    public position typeOfEmployee() {
        return  position.DIRECTOR;
    }
}
