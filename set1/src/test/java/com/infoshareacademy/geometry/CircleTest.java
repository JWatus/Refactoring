package com.infoshareacademy.geometry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class CircleTest {

    @Test
    public void polePow_promienJednostkowy_pi() {
        Circle o = new Circle(1);
        assertThat(o.calculateArea()).isEqualTo(3.14159);
    }

    @Test
    public void polePow_promien2() {
        Circle o = new Circle(2);
        assertThat(o.calculateArea()).isEqualTo(12.56636);
    }

    @Test
    public void obwod_promienJednostkowy_pi() {
        Circle o = new Circle(1);
        assertThat(o.calculateCircuit()).isEqualTo(6.28318);
    }

    @Test
    public void obwod_promien2() {
        Circle o = new Circle(2);
        assertThat(o.calculateCircuit()).isEqualTo(12.56636);
    }

    @Test
    public void promien2_obwodJestRownyPoluPowierzchni() {
        Circle o = new Circle(2);
        assertThat(o.calculateCircuit()).isEqualTo(o.calculateArea());
    }

}