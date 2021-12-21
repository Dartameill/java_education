package com.company.lesson5_and_lesson6_rewrite;

public abstract class Employee extends Person {

    Position position;
    String name;
    String surname;
    int salary;

    public int salarySum(int baseRate, int expEmployee) {
        return baseRate * position.rate * expEmployee;
    }

    Employee(Position position) {
        this.position = position;
    }

    abstract Position getPositionEmployee();
}
