package com.company.lesson5;


public abstract class Employee {
   position worker = position.WORKER;
   position director = position.DIRECTOR;
   int expEmployee;
   double baseRate;

   public double sumOfSalary() {
        double salary = baseRate * expEmployee * position.RATE.rateOfSalary;
        return salary;
   }

   abstract String getPositionEmployee();

}
