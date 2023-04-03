package com.exam.tasks.task3;

import com.exam.tasks.task3.data.ReadEmployee;
import com.exam.tasks.task3.data.WriteEmployees;
import com.exam.tasks.task3.validate.Validate;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        var readEmployees = new ReadEmployee();
        var stringEmployees = readEmployees.readAllUsers();
        var validate = new Validate();
        var validateEmployees = validate.validateEmployees(stringEmployees);
        var finalEmployee = validate.searchEmployees(validateEmployees);
        var writeData = new WriteEmployees();
        writeData.writeEmployeesToFile(finalEmployee);
    }
}
