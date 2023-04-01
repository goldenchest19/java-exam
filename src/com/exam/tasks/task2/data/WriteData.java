package com.exam.tasks.task2.data;

import com.exam.tasks.task2.model.Employee;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public interface WriteData {
    String FILE_PATH_TO_WRITE = "src/com/exam/tasks/task2/resources/employees_with_positions.txt";
    DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public void writeFinalData(ArrayList<Employee> employees) throws IOException;
}
