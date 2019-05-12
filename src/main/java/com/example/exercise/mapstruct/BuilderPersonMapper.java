package com.example.exercise.mapstruct;

import com.example.exercise.lombok.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BuilderPersonMapper {
    BuilderPersonMapper INSTANCE = Mappers.getMapper( BuilderPersonMapper.class );

    PersonDto personToPersonDto(Person person);

    public static class Person {

        private final String name;

        protected Person(Person.Builder builder) {
            this.name = builder.name;
        }

        public static Person.Builder builder() {
            return new Person.Builder();
        }

        public static class Builder {

            private String name;

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Person create() {
                return new Person( this );
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class PersonDto {
        private String name;
        private int age;
        private Gender gender;
    }
}
