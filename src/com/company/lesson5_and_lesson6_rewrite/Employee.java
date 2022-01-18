package com.company.lesson5_and_lesson6_rewrite;

public abstract class Employee extends Person {

    Position position;
    int salary;
    int baseRate;
    int expEmployee;

    public int salarySum() {
        return baseRate * position.rate * expEmployee;
    }

    Employee(Position position) {
        this.position = position;
    }

    abstract Position getPositionEmployee();
}
