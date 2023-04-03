package com.exam.tasks.task3.validate;

import com.exam.tasks.task3.model.Employee;

public class CheckFIO implements Checker{
    @Override
    public boolean check(String line) {
        return line.length() < 100;
    }

    @Override
    public String description() {
        return "ФИО сотрудника длинее 100 символов";
    }
}
