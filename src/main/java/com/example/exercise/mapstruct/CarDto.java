package com.example.exercise.mapstruct;

import lombok.Data;

import java.util.List;

@Data
public class CarDto {
    private String make;
    private int seatCount;
    private String type;
    private String boughtAt;

    private PersonDto owner;
    private List<PersonDto> owners;
}
