package com.example.exercise.mapstruct;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CarMapperTest {
    @Test
    public void shouldMapCarToDto() {
        Car car = new Car("Morris", 5, CarType.SEDAN, new Date(), null, null);

        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        assertThat(carDto, is(notNullValue()));
        assertThat(carDto.getMake(), is("Morris"));
        assertThat(carDto.getSeatCount(), is(5));
        assertThat(carDto.getType(), is("SEDAN"));
    }
}
