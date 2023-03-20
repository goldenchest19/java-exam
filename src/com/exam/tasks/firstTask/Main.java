package com.exam.tasks.firstTask;

import com.exam.tasks.firstTask.data.Data;
import com.exam.tasks.firstTask.model.Employee;
import com.exam.tasks.firstTask.validate.Validate;

import java.io.IOException;
import java.util.List;

// чтение - задача - запись
public class Main {
    private static final String FILE_PATH = "src/com/exam/tasks/firstTask/result.txt";

    public static void main(String[] args) throws IOException {
        List<Employee> employees = Data.readFile();
//        employees.forEach(System.out::println);
        List<Employee> employeeBeforeValidate = Validate.validate(employees);
        Data.writeFile(employeeBeforeValidate);
    }
}
