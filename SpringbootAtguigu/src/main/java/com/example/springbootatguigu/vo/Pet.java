package com.example.springbootatguigu.vo;

public class Pet {
    private String name;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }
}
