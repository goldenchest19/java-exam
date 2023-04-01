package com.exam.tasks.task2.model;

import java.util.HashMap;
import java.util.Map;

public class Position {
    private String positionCode;
    private String positionName;
    private final Map<String, String> position = new HashMap<>();

    public Position() {
    }

    public Map<String, String> getPosition() {
        return position;
    }

    public void setPosition(String positionCode, String positionName) {
        position.put(positionCode, positionName);
    }
}
