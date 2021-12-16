package com.company.lesson5_and_lesson6_rewrite;

public class Worker extends Employee {

    String name;
    String surname;
    int salary;

    public Worker(String name, String surname, int salary) {
        super(Position.WORKER);
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    Position getPositionEmployee() {
        return this.position;
    }

    public void getInfo() {
        System.out.println("Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", position=" + getPositionEmployee() +
                "}");
    }
}
