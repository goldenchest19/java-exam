package com.exam.tasks.task2.data;

import com.exam.tasks.task2.model.Employee;
import com.exam.tasks.task2.model.Position;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public interface ReadData {
    String FILE_PATH_TO_READ_EMPLOYEES = "src/com/exam/tasks/task2/resources/employees.txt";
    String FILE_PATH_TO_READ_POSITIONS = "src/com/exam/tasks/task2/resources/positions.txt";
    DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public List<Employee> readEmployees() throws IOException;
    public Position readPositions() throws IOException;

 }
