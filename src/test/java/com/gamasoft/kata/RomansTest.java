package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {

    public static final String ROMAN_FIVE = "V";
    public static final String ROMAN_ONE = "I";

    @Test
    public void oneIsI() {
        assertThat(romanFives(1), is("I"));
    }

    @Test
    public void twoIsII() {
        assertThat(romanFives(2), is("II"));
    }

    @Test
    public void threeIsIII() {
        assertThat(romanFives(3), is("III"));
    }

    @Test
    public void fourIsIV() {

        assertThat(romanFives(4), is("IV"));
    }

    @Test
    public void fiveIsV() {

        assertThat(romanFives(5), is("V"));
    }

    @Test
    public void sixIsVI() {

        assertThat(romanFives(6), is("VI"));
    }

    @Test
    public void sevenIsVII() {

        assertThat(romanFives(7), is("VII"));
    }

    @Test
    public void eightIsVIII() {

        assertThat(romanFives(8), is("VIII"));
    }

    @Test
    public void nineIsIX() {

        assertThat(romanFives(9), is("IX"));
    }

    private String romanFives(int number) {
        if (number < 4) {
            return romanOnes(number);
        } else {
            return romanOnes(5 - number) + ROMAN_FIVE + romanOnes(number - 5);
        }
    }

    private String romanOnes(int number) {
        String two = "";
        for (int i = 0; i < number; i++) {
            two += ROMAN_ONE;
        }
        return two;
    }

}
