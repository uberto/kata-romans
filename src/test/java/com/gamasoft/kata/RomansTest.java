package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {

    public static final String ROMAN_FIVE = "V";
    public static final String ROMAN_ONE = "I";
    private static final String ROMAN_TEN = "X";
    private static final String ROMAN_FIFTY = "L";

    @Test
    public void oneIsI() {
        assertThat(romanCalculator(1), is("I"));
    }

    @Test
    public void twoIsII() {
        assertThat(romanCalculator(2), is("II"));
    }

    @Test
    public void threeIsIII() {
        assertThat(romanCalculator(3), is("III"));
    }

    @Test
    public void fourIsIV() {

        assertThat(romanCalculator(4), is("IV"));
    }

    @Test
    public void fiveIsV() {

        assertThat(romanCalculator(5), is("V"));
    }

    @Test
    public void sixIsVI() {

        assertThat(romanCalculator(6), is("VI"));
    }

    @Test
    public void sevenIsVII() {

        assertThat(romanCalculator(7), is("VII"));
    }

    @Test
    public void eightIsVIII() {

        assertThat(romanCalculator(8), is("VIII"));
    }

    @Test
    public void nineIsIX() {

        assertThat(romanCalculator(9), is("IX"));
    }

    @Test
    public void tenIsX() {

        assertThat(romanCalculator(10), is("X"));
    }

    @Test
    public void twelveIsXII() {

        assertThat(romanCalculator(12), is("XII"));
    }

    @Test
    public void fourteenIsXIV() {
        assertThat(romanCalculator(14), is("XIV"));
    }

    @Test
    public void eighteenIsXVIII() {
        assertThat(romanCalculator(18), is("XVIII"));
    }

    @Test
    public void nineteenIsXIX() {

        assertThat(romanCalculator(19), is("XIX"));
    }

    @Test
    public void twentyNineIsXXIX() {
        assertThat(romanCalculator(29), is("XXIX"));
    }

    @Test
    public void thirtySixIsXXXVI() {
        assertThat(romanCalculator(36), is("XXXVI"));
    }

    @Test
    public void fortyIsXL() {
        assertThat(romanCalculator(40), is("XL"));
    }

    @Test
    public void fiftyFourIsLIV() {
        assertThat(romanCalculator(54), is("LIV"));
    }

    private String romanCalculator(int number) {
    return romanAroundFifty(number);
    }

    private String romanAroundFifty(int number) {
        String actual;
        if (number < 40) {
            actual = romanAroundTen(number);
        } else {
            actual =  ROMAN_TEN + ROMAN_FIFTY + romanAroundTen(number - 40);
        }
        return actual;
    }

    private String romanAroundTen(int number) {
        String actual;
        if (number < 9) {
            actual = romanAroundFive(number);
        } else {
            actual =  romanOnes(10 - number) + ROMAN_TEN + romanCalculator(number - 10);
        }
        return actual;
    }

    private String romanAroundFive(int number) {
        if (number < 4) {
            return romanOnes(number);
        } else {
            return romanOnes(5 - number) + ROMAN_FIVE + romanOnes(number - 5);
        }
    }

    private String romanOnes(int number) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < number; i++) {
            sb.append( ROMAN_ONE);
        }
        return sb.toString();
    }

}
