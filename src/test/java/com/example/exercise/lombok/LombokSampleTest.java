package com.example.exercise.lombok;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LombokSampleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void NonNullをつけたフィールドがnullの場合は例外となる() {

        thrown.expect(NullPointerException.class);
        thrown.expectMessage("name is marked @NonNull but is null");

        new NonNullPerson(null, 17, Gender.MALE);
    }

    @Test
    public void Builderアノテーションでbuilderパターン用メソッドが生成されること() {
        BuilderPerson person = BuilderPerson
                .builder()
                .name("Tom")
                .age(17)
                .gender(Gender.MALE)
                .build();

        assertThat(person, is(notNullValue()));
    }

    @Test
    public void NonNullとBuilderを組み合わせればNullチェックできる() {

        thrown.expect(NullPointerException.class);
        thrown.expectMessage("name is marked @NonNull but is null");

        NonNullBuilderPerson
                .builder()
                .name(null)
                .age(17)
                .gender(null)
                .build();
    }

    @Test
    public void Valueアノテーションをつけてもミュータブルなフィールドは防御できない() {
        Date now = new Date();
        ValuePerson person = new ValuePerson("Tom", 0, Gender.MALE, now);
        Date birthday = person.getBirthday();
        birthday.setYear(2000);

        assertThat(person.getBirthday(), is(now));
        assertThat(now, is(birthday));
        assertThat(now.getYear(), is(2000));
    }
}
