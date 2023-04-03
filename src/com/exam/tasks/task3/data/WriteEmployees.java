package com.exam.tasks.task3.data;


import com.exam.tasks.task3.model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteEmployees implements WriteData {
    @Override
    public void writeEmployeesToFile(List<Employee> list) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_TO_WRITE))) {
            list.stream()
                    .sorted((e2, e1) -> Long.compare(e1.getSalary(), e2.getSalary()))
                    .forEach(employee -> {
                        try {
                            writer.write(employee.toString());
                            writer.append('\n');
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }
}
