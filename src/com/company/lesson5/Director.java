package com.company.lesson5;

public class Director extends Worker {

    public String name;
    public String surname;
    public int salary;
    public int count = 0;

    public Director(String name, String surname, int salary) {
        super();
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Director addWorker(Worker worker) {
        worker.typeOfEmployee();
        count++;
        System.out.println("Quantity of employees: " + count);
        return this;
    }

    public position typeOfEmployee() {
        return  position.DIRECTOR;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", count=" + count +
                '}';
    }
}
