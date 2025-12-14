package com.pantxi.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FizzBuzzTest {

    // Scénario T1 : 1 -> "1"
    @Test
    void testDe1_DoitRetourner1() {
        // ACT & ASSERT (Utilisation d'AssertJ)
        assertThat(FizzBuzz.de(1)).isEqualTo("1");
    }
    // Scénario T2 : 3 -> "Fizz"
    @Test
    void testDe3_DoitRetournerFizz() {
        assertThat(FizzBuzz.de(3)).isEqualTo("Fizz");
    }
    // Scénario T3 : 5 -> "Buzz"
    @Test
    void testDe5_DoitRetournerBuzz() {
        assertThat(FizzBuzz.de(5)).isEqualTo("Buzz");
    }
    // Scénario T6 : 15 -> "FizzBuzz"
    @Test
    void testDe15_DoitRetournerFizzBuzz() {
        assertThat(FizzBuzz.de(15)).isEqualTo("FizzBuzz");
    }
    @Test
    void testDe6_DoitRetournerFizz() {
        assertThat(FizzBuzz.de(6)).isEqualTo("Fizz");
    }

    @Test
    void testDe10_DoitRetournerBuzz() {
        assertThat(FizzBuzz.de(10)).isEqualTo("Buzz");
    }

    @Test
    void testDe4_DoitRetourner4() {
        assertThat(FizzBuzz.de(4)).isEqualTo("4");
    }
}