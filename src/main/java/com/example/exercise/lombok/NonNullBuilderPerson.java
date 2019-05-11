package com.example.exercise.lombok;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class NonNullBuilderPerson {
    private String name;
    private int age;
    private Gender gender;

    public NonNullBuilderPerson(@NonNull String name, int age, @NonNull Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
