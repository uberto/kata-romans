package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {

    @Test
    public void oneIsI() {
        assertThat(romanOne(), is("I"));
    }

    @Test
    public void twoIsII() {
        assertThat(romanFour(2), is("II"));
    }

    @Test
    public void threeIsIII() {
        assertThat(romanFour(3), is("III"));
    }

    @Test
    public void fourIsIV() {

        assertThat(romanFour(4), is("IV"));
    }

    @Test
    public void fiveIsV() {

        int number = 5;

        String actual;
        if (number < 5) {
            actual = romanFour(number);
        } else {
            actual = "V" + romanOnes(number - 5);
        }
        assertThat(actual, is("V"));
    }

    private String romanFour(int number) {
        String roman = "";
        if (number == 4) {
            roman = romanOnes(1) + "V";
        } else {
            roman = romanOnes(number);
        }
        return roman;
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
