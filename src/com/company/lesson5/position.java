package com.company.lesson5;

public enum position {

    DIRECTOR(5),
    WORKER(10),
    RATE(2);

    public int rateOfSalary;

    position(int rateOfSalary) {
        this.rateOfSalary = rateOfSalary;
    }
}