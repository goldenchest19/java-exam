package com.exam.tasks.firstTask.model;

import java.time.LocalDate;
import java.time.Period;

public final class Employee {
    private final String FIO;
    private final LocalDate dateOfEmployment;
    private final long salary;

    //сделать класс immutable

    public Employee(String fio, LocalDate dateOfEmployment, long salary) {
        FIO = fio;
        this.dateOfEmployment = dateOfEmployment;
        this.salary = salary;
    }

    public long getMonthExperience() {
        Period period = Period.between(dateOfEmployment, LocalDate.now());
        return period.toTotalMonths();
    }

    public int getYearExperience() {
        LocalDate NOW = LocalDate.now();
        Period period = Period.between(dateOfEmployment, NOW);
        return period.getYears();
    }

    public String getFIO() {
        return FIO;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return FIO + ";" + getMonthExperience() + ";" + salary;
    }
    public String toWriteErrors() {
        return FIO + ";" + dateOfEmployment + ";" + salary;
    }
}
