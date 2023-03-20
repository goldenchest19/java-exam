package com.exam.tasks.firstTask.data;

import com.exam.tasks.firstTask.validate.Checker;
import com.exam.tasks.firstTask.model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Data {
    private static final String FILE_PATH_TO_READ = "src/com/exam/tasks/firstTask/resources/employees.txt";
    private static final String FILE_PATH_TO_WRITE = "src/com/exam/tasks/firstTask/resources/result.txt";
    private final static DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    public static List<Employee> readFile() throws IOException {
        List<Employee> employees = new ArrayList<>();
        Path path = Paths.get(FILE_PATH_TO_READ);

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] array = line.split(";");
                employees.add(new Employee(array[0],
                        LocalDate.parse(array[1], FORMAT),
                        Long.parseLong(array[2])));
            }
        }
        return employees;
    }

    public static void writeFile(List<Employee> list) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_TO_WRITE))) {
            list = list.stream()
                    .filter(employee -> employee.getYearExperience() < 3)
                    .sorted(Comparator.comparing(Employee::getMonthExperience))
                    .collect(Collectors.toList());

            for (Employee employee : list) {
                writer.write(employee.toString());
                writer.append('\n');
            }
        }
    }
}
