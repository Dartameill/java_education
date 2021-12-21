package com.company.lesson5_and_lesson6_rewrite;

public class Worker extends Employee {

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

    @Override
    public String toString() {
        return "Worker{" +
                "position=" + position +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
