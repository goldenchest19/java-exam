package com.exam.tasks.task3.model;

public class Employee {
    private final String FIO;
    private final String gender;
    private final long salary;

    public Employee(String FIO, String gender, long salary) {
        this.FIO = FIO;
        this.gender = gender;
        this.salary = salary;
    }

    public String getFIO() {
        return FIO;
    }

    public String getGender() {
        return gender;
    }

    public long getSalary() {
        return salary;
    }

    public String toWriteErrors() {
        return FIO + ";" + gender + ";" + salary;
    }

    public String toString() {
        return FIO + ";" + (getGender().equals("М") ? "мужчина" : "женщина") + ";" + salary;
    }
}
