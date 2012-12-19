package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {


    @Test
    public void zeroIsEmptyString() {
        assertThat(RomanCalculator.calculate(0), is(""));
    }

    @Test
    public void oneIsI() {
        assertThat(RomanCalculator.calculate(1), is("I"));
    }

    @Test
    public void twoIsII() {
        assertThat(RomanCalculator.calculate(2), is("II"));
    }

    @Test
    public void threeIsIII() {
        assertThat(RomanCalculator.calculate(3), is("III"));
    }

    @Test
    public void fourIsIV() {

        assertThat(RomanCalculator.calculate(4), is("IV"));
    }

    @Test
    public void fiveIsV() {

        assertThat(RomanCalculator.calculate(5), is("V"));
    }

    @Test
    public void sixIsVI() {

        assertThat(RomanCalculator.calculate(6), is("VI"));
    }

    @Test
    public void sevenIsVII() {

        assertThat(RomanCalculator.calculate(7), is("VII"));
    }

    @Test
    public void eightIsVIII() {

        assertThat(RomanCalculator.calculate(8), is("VIII"));
    }

    @Test
    public void nineIsIX() {

        assertThat(RomanCalculator.calculate(9), is("IX"));
    }

    @Test
    public void tenIsX() {

        assertThat(RomanCalculator.calculate(10), is("X"));
    }

    @Test
    public void twelveIsXII() {

        assertThat(RomanCalculator.calculate(12), is("XII"));
    }

    @Test
    public void fourteenIsXIV() {
        assertThat(RomanCalculator.calculate(14), is("XIV"));
    }

    @Test
    public void eighteenIsXVIII() {
        assertThat(RomanCalculator.calculate(18), is("XVIII"));
    }

    @Test
    public void nineteenIsXIX() {

        assertThat(RomanCalculator.calculate(19), is("XIX"));
    }

    @Test
    public void twentyNineIsXXIX() {
        assertThat(RomanCalculator.calculate(29), is("XXIX"));
    }

    @Test
    public void thirtySixIsXXXVI() {
        assertThat(RomanCalculator.calculate(36), is("XXXVI"));
    }

    @Test
    public void fortyIsXL() {
        assertThat(RomanCalculator.calculate(40), is("XL"));
    }

    @Test
    public void fiftyFourIsLIV() {

        assertThat(RomanCalculator.calculate(54), is("LIV"));
    }

    @Test
    public void sixtyNineIsLXIX() {

        assertThat(RomanCalculator.calculate(69), is("LXIX"));
    }

    @Test
    public void ninetyNineIsXCIX() {

        assertThat(RomanCalculator.calculate(99), is("XCIX"));
    }


}
