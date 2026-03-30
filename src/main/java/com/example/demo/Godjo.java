package com.example.demo;

public class Godjo {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("Дерево")) {
            throw new RuntimeException("Недопустимое имя: " + name);
        }

        this.name = name;
    }

}

