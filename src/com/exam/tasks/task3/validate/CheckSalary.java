package com.exam.tasks.task3.validate;

public class CheckSalary implements Checker {
    @Override
    public boolean check(String line) {
        float salary = Float.parseFloat(line);
        long intSalary = (long) salary;
        return intSalary - salary == 0;
    }

    @Override
    public String description() {
        return "Оклад не целое число";
    }
}
