package com.example.exercise.lombok;

import lombok.NonNull;

public class NonNullPerson {
    private String name;
    private int age;
    private Gender gender;

    public NonNullPerson(@NonNull String name, int age, @NonNull Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
