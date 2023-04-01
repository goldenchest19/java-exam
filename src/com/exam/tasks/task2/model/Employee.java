package com.exam.tasks.task2.model;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int experience;
    private String codePosition;
    private String namePosition;

    public Employee() {
    }

    public Employee(String surname, String name, String patronymic, int experience, String codePosition) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.experience = experience;
        this.codePosition = codePosition;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getCodePosition() {
        return codePosition;
    }

    public int getExperience() {
        return experience;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + " " + namePosition + " " + experience;
    }
}
