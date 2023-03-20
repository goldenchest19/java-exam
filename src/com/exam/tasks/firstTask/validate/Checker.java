package com.exam.tasks.firstTask.validate;

import com.exam.tasks.firstTask.model.Employee;

public interface Checker {
      boolean check(Employee employee);
      String description();
}
