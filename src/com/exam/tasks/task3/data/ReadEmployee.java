package com.exam.tasks.task3.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadEmployee implements ReadData {
    @Override
    public List<String> readAllUsers() throws IOException {
        return Files.readAllLines(Path.of(FILE_PATH_TO_READ));
    }
}
