package com.exam.tasks.firstTask.validate;

import com.exam.tasks.firstTask.model.Employee;

import java.time.LocalDate;

public class DateChecker implements Checker{
    @Override
    public boolean check(Employee employee) {
        return employee.getDateOfEmployment().isBefore(LocalDate.now());
    }

    @Override
    public String description() {
        return "Вы ввели некорректную дату трудоустройства";
    }
}
