package com.exam.tasks.firstTask.validate;

import com.exam.tasks.firstTask.model.Employee;

public class SalaryChecker implements Checker{
    @Override
    public boolean check(Employee employee) {
        return employee.getSalary() % 100 == 0;
    }

    @Override
    public String description() {
        return "Введенная вами зарплата не кратна 100";
    }
}
