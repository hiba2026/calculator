package com.pantxi.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*; // AssertJ pour les assertions

// Pas besoin de @BeforeEach car la méthode 'convert' sera statique.
class ArabicRomanNumeralsTest {

    // Scénario T1 : 1 -> I
    @Test
    void testConvert1_DoitRetournerI() {
        // ACT & ASSERT (Utilisation d'AssertJ)
        assertThat(ArabicRomanNumerals.convert(1)).isEqualTo("I");
    }

    // Scénario T2 : 3 -> III
    @Test
    void testConvert3_DoitRetournerIII() {
        assertThat(ArabicRomanNumerals.convert(3)).isEqualTo("III");
    }

    // Scénario T3 : 4 -> IV
    @Test
    void testConvert4_DoitRetournerIV() {
        assertThat(ArabicRomanNumerals.convert(4)).isEqualTo("IV");
    }


    // Tests de couverture
    @Test
    void testConvert5_DoitRetournerV() {
        assertThat(ArabicRomanNumerals.convert(5)).isEqualTo("V");
    }

    @Test
    void testConvert6_DoitRetournerVI() {
        assertThat(ArabicRomanNumerals.convert(6)).isEqualTo("VI");
    }

    @Test
    void testConvert9_DoitRetournerIX() {
        assertThat(ArabicRomanNumerals.convert(9)).isEqualTo("IX");
    }

    @Test
    void testConvert10_DoitRetournerX() {
        assertThat(ArabicRomanNumerals.convert(10)).isEqualTo("X");
    }

    @Test
    void testConvert19_DoitRetournerXIX() {
        assertThat(ArabicRomanNumerals.convert(19)).isEqualTo("XIX");
    }

    @Test
    void testConvert40_DoitRetournerXL() {
        assertThat(ArabicRomanNumerals.convert(40)).isEqualTo("XL");
    }

    @Test
    void testConvert50_DoitRetournerL() {
        assertThat(ArabicRomanNumerals.convert(50)).isEqualTo("L");
    }
}