package com.exam.tasks.task3.validate;

import com.exam.tasks.task3.model.Employee;

public interface Checker {
    boolean check(String line);
    String description();
}
