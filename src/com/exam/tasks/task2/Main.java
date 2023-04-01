package com.exam.tasks.task2;

import com.exam.tasks.task2.data.ReadDataEmployeesAndPositions;
import com.exam.tasks.task2.data.WriteDataEmployeeWithPositions;
import com.exam.tasks.task2.model.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        var employees = new ReadDataEmployeesAndPositions().readEmployees();
        var positions = new ReadDataEmployeesAndPositions().readPositions();
        ArrayList<Employee> finalList = new ArrayList<>();
        int experience = 0;
        var employeeWithMaxExperience = new Employee();
        var mapPositions = positions.getPosition();

        for (Map.Entry<String, String> stringStringEntry : mapPositions.entrySet()) {
            for (Employee employee : employees) {
                String key = stringStringEntry.getKey();
                if (employee.getCodePosition().equals(key)) {
                    if (employee.getExperience() > experience) {
                        experience = employee.getExperience();
                        employeeWithMaxExperience = employee;
                        employeeWithMaxExperience.setNamePosition(stringStringEntry.getValue());
                    }
                }
            }
            finalList.add(employeeWithMaxExperience);
            experience = 0;
        }

        var writeData = new WriteDataEmployeeWithPositions();
        writeData.writeFinalData(finalList);
    }
}
