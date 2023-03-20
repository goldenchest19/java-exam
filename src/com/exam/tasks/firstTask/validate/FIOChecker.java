package com.exam.tasks.firstTask.validate;

import com.exam.tasks.firstTask.model.Employee;

public class FIOChecker implements Checker {
    @Override
    public boolean check(Employee employee) {
        return employee.getFIO().length() < 120;
    }

    @Override
    public String description() {
        return "ФИО должно быть меньше 120 символов";
    }
}
