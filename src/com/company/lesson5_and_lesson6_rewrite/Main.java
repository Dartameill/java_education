package com.company.lesson5_and_lesson6_rewrite;

public class Main {
    public static void main(String[] args) {
        WorkerFinderImpl iml = new WorkerFinderImpl();

        Worker worker1 = new Worker("Stev", "Madison", 2000);
        Worker worker2 = new Worker("Deiv", "Super", 2500);
        Worker worker3 = new Worker("Daive", "Maik", 3000);
        Director director1 = new Director("Boss", "Bossovich", 4000);
        Director director2 = new Director("Boss2", "Bossovich2", 5000);


        director1.addWorker(worker1);
        director1.addWorker(worker2);

        director2.addWorker(worker3);
        director1.addWorker(director2);

        iml.findWorker(director1, "Stev");

        System.out.println(director1);
    }
}
