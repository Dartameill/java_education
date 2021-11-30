package com.company.lesson5;

public class Worker {

    public String name;
    public String surname;
    public int salary;

    public Worker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Worker() {

    }

    public position typeOfEmployee() {
      return  position.WORKER;
    }


}
