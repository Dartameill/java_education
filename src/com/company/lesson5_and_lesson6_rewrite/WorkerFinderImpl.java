package com.company.lesson5_and_lesson6_rewrite;

import java.util.Optional;

public class WorkerFinderImpl implements WorkerFinder {

    WorkerFinderImpl() {
    }

    @Override
    public Director findWorker(Director director, String name) {
        Optional<Worker> result = director.workers.stream()
                .filter(worker -> worker.name.equals(name))
                .findFirst();
        if (result.isPresent()) {
            System.out.println("Worker has been found, his info is :");
            result.get().getInfo();
        }
        return director;
    }
}




