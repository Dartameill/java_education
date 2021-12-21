package com.company.lesson5_and_lesson6_rewrite;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {

    int rateDirector = Position.DIRECTOR.rate;
    List<Director> directors = new ArrayList<>();
    List<Worker> workers = new ArrayList<>();

    public Director(String name, String surname, int salary) {
        super(Position.DIRECTOR);
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void addDirector(Director director) {
        directors.add(director);
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    @Override
    Position getPositionEmployee() {
        return this.position;
    }

    public void getAllInfo() {
        this.getInfo();
        System.out.println("Workers:");
        for (Worker worker : workers) {
            worker.getInfo();
        }
        System.out.println("Directors:");
        for (Director director : directors) {
            director.getInfo();
        }
    }

    public void getInfo() {
        System.out.println("Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", position=" + getPositionEmployee() +
                ", rate=" + Position.DIRECTOR.rate +
                ", QuantityOfEmployees=" + workers.size() +
                "}");
    }
}
