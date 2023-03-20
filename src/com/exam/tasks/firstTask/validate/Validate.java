package com.exam.tasks.firstTask.validate;

import com.exam.tasks.firstTask.model.Employee;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validate {

    private final static DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final Set<Checker> CONDITIONS = new HashSet<>(Set.of(new FIOChecker(), new DateChecker(), new SalaryChecker()));

    public static List<Employee> validate(List<Employee> employees) {
        List<Employee> employeesBeforeValidate = new ArrayList<>();
        for (Employee employee : employees) {
            boolean flag = true;
            StringBuilder logs = new StringBuilder(employee.toWriteErrors()).append('\n');
            for (Checker checker : CONDITIONS) {
                if (!checker.check(employee)) {
                    flag = false;
                    logs.append(checker.description()).append('\n');
                }
            }
            if (flag) {
                employeesBeforeValidate.add(employee);
            } else {
                System.out.println(logs);
            }
        }
        return employeesBeforeValidate;
//        return employees.stream()
//                .filter(employee -> employee.getFIO().length() < 120)
//                .filter(employee -> employee.getDateOfEmployment().isBefore(LocalDate.now()))
//                .filter(employee -> employee.getSalary() % 100 == 0)
//                .sorted(Comparator.comparing(Employee::getDateOfEmployment))
//                .collect(Collectors.toList());
    }
}

