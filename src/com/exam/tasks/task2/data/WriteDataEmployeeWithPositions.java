package com.exam.tasks.task2.data;

import com.exam.tasks.task2.model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteDataEmployeeWithPositions implements WriteData {

    @Override
    public void writeFinalData(ArrayList<Employee> employees) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_TO_WRITE))) {
            employees.forEach(employee -> {
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
