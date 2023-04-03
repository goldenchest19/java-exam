package com.exam.tasks.task3.validate;


import com.exam.tasks.task3.model.Employee;

public class CheckGender implements Checker{


    @Override
    public boolean check(String line) {
        // м - русская
        return line.equals("М") || line.equals("Ж");
    }

    @Override
    public String description() {
        return "Вы ввели некорректно пол";
    }
}
