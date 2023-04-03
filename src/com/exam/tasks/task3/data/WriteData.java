package com.exam.tasks.task3.data;

import com.exam.tasks.task3.model.Employee;

import java.io.IOException;
import java.util.List;

public interface WriteData {
    String FILE_PATH_TO_WRITE = "src/com/exam/tasks/task3/resources/result.txt";

    void writeEmployeesToFile(List<Employee> list) throws IOException;
}
