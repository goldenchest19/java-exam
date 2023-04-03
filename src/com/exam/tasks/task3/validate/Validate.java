package com.exam.tasks.task3.validate;


import com.exam.tasks.task3.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Validate {
    private static final Map<Integer,Checker> CONDITIONS = Map.of(
            0, new CheckFIO(),
            1, new CheckGender(),
            2, new CheckSalary());


    public List<Employee> validateEmployees(List<String> list) {
        List<Employee> validateEmployee = new ArrayList<>();
        boolean flag = true;

        for (String line : list) {
            String[] mas = line.split(";");
            StringBuilder logs = new StringBuilder(line).append('\n');

            for (int i = 0; i < mas.length; i++) {
                if (!CONDITIONS.get(i).check(mas[i])) {
                    flag = false;
                    logs.append(CONDITIONS.get(i).description()).append('\n');
                }
            }
            if (flag) {
                validateEmployee.add(new Employee(mas[0], mas[1], Long.parseLong(mas[2])));
            } else {
                System.out.println(logs);
            }
            flag = true;
        }
        return validateEmployee;
    }

    public List<Employee> searchEmployees(List<Employee> list) {
        double avg = list.stream()
                .filter(employee -> employee.getGender().equals("М"))
                .map(Employee::getSalary).mapToLong(employee1 -> employee1).average().getAsDouble();
        System.out.println("avg=" + avg);
        List<Employee> employees = list.stream()
                .filter(employee -> employee.getSalary() > avg)
                .collect(Collectors.toList());
        return employees;
    }
}
