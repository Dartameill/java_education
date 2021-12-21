package com.company.lesson5_and_lesson6_rewrite;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {


    int rateDirector = Position.DIRECTOR.rate;
    List<Employee> employees = new ArrayList<>();

    public Director(String name, String surname, int salary) {
        super(Position.DIRECTOR);
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int salarySum() {
        for(int i = 0; i < employees.size(); i++) {
            rateDirector = rateDirector * 2;
        }
        return super.salarySum();
    }

    public void addWorker(Employee employee) {
        employees.add(employee);
    }

    @Override
    Position getPositionEmployee() {
        return this.position;
    }

    @Override
    public String toString() {
        return "Director{" +
                "rateDirector=" + rateDirector +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", employees=" + employees +
                ", position=" + position +
                '}';
    }
}
