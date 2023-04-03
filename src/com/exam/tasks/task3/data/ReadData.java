package com.exam.tasks.task3.data;

import com.exam.tasks.task3.model.Employee;

import java.io.IOException;
import java.util.List;

public interface ReadData {
    String FILE_PATH_TO_READ = "src/com/exam/tasks/task3/resources/employee.txt";
    List<String> readAllUsers() throws IOException;
}
