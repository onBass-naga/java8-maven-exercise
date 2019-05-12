package com.example.exercise.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Car {
    private String make;
    private int numberOfSeats;
    private CarType type;
    private Date boughtAt;

    private Person owner;
    private List<Person> owners;
}
