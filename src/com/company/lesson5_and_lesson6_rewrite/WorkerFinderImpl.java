package com.company.lesson5_and_lesson6_rewrite;

import java.util.Optional;

public class WorkerFinderImpl implements WorkerFinder {

    WorkerFinderImpl() {
    }

    @Override
    public void findWorker(Director director, String name) {
        Optional<Employee> result = director.employees.stream()
                .filter(employee -> employee.name.equals(name))
                .findFirst();
        if (result.isPresent()) {
            System.out.println("Worker has been found, his info is :");
            System.out.println(result.get());
        }

    }
}




