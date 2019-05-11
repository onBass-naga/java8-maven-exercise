package com.example.exercise.lombok;

import lombok.Value;

import java.util.Date;

@Value
public class ValuePerson {
    private String name;
    private int age;
    private Gender gender;
    private Date birthday;
}
