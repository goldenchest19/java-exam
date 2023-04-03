package com.exam.tasks.task2.data;

import com.exam.tasks.task2.model.Employee;
import com.exam.tasks.task2.model.Position;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadDataEmployeesAndPositions implements ReadData {
    @Override
    public List<Employee> readEmployees() throws IOException {
        List<Employee> employees = new ArrayList<>();
        Path path = Paths.get(FILE_PATH_TO_READ_EMPLOYEES);

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] array = line.split(" ");
                employees.add(new Employee(array[0], array[1], array[2], Integer.parseInt(array[3]), array[4]));
            }
        }
        return employees;
    }

    @Override
    public Position readPositions() throws IOException {
        Path path = Paths.get(FILE_PATH_TO_READ_POSITIONS);
        var position = new Position();

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                String regex = "^(\\d+)\\s+\"([^\"]+)\"";

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);

                if (matcher.find()) {
                    position.setPosition(matcher.group(1), matcher.group(2));
                    continue;
                }

                String[] parts = line.split(" ");
                position.setPosition(parts[0], parts[1]);
            }
        }
        return position;
    }
}
