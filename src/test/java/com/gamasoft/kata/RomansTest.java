package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {

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

    private String romanFives(int number) {
        if (number < 4) {
            return romanOnes(number);
        } else {
            return romanOnes(5 - number) + romanFive() + romanOnes(number - 5);
        }
    }

    private String romanFive() {
        return "V";
    }

    private String romanOnes(int number) {
        String two = "";
        for (int i = 0; i < number; i++) {
            two += romanOne();
        }
        return two;
    }

    private String romanOne() {
        return "I";
    }
}
