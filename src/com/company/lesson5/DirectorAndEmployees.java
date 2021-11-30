package com.company.lesson5;

public class DirectorAndEmployees {
    public static void main(String[] args) {
       Worker emp1 = new Worker("John", "Bring", 1000);
       Worker emp2 = new Worker("Kate", "Nilson", 2500);
       Worker emp3 = new Worker("Stive", "Manson", 4000);
       Director boss = new Director("Boss", "Bossovich", 8000);
       Director boss2 = new Director("Boss2", "Boss2", 9000);

        System.out.println(emp1.name + " " + emp1.surname + " " + emp1.salary);
        System.out.println(emp2.name + " " + emp2.surname + " " + emp3.salary);
        System.out.println(emp3.name + " " + emp3.surname + " " + emp3.salary);
        System.out.println(boss.name + " " + boss.surname + " " + boss.salary);

        boss.addWorker(emp1);
        boss.addWorker(emp2);
        System.out.println(boss.typeOfEmployee());

        boss.addWorker(boss2);
        System.out.println(boss.toString());

    }
}
