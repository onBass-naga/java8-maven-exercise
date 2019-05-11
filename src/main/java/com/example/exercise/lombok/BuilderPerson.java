package com.example.exercise.lombok;

import lombok.Builder;

@Builder
public class BuilderPerson {
    private String name;
    private int age;
    private Gender gender;
}
