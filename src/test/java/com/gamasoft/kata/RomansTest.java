package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {

    public static final RomanToken ROMAN_ONE = new RomanToken("I", 1);
    public static final RomanToken ROMAN_FIVE = new RomanToken("V", 5);
    private static final String ROMAN_TEN = "X";
    private static final String ROMAN_FIFTY = "L";
    private static final String ROMAN_HUNDRED = "C";

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

    @Test
    public void sixtyNineIsLXIX() {

        assertThat(romanCalculator(69), is("LXIX"));
    }

    @Test
    public void ninetyNineIsXCIX() {

        assertThat(romanCalculator(99), is("XCIX"));
    }

    private String romanCalculator(int number) {

        return romansAroundOneHundred(number);
    }


    private String romansAroundOneHundred(int number) {
        String actual;
        if (number < 90) {
            actual = romanAroundFifty(number);
        } else {
            actual = (number < 100 ? ROMAN_TEN : "") + ROMAN_HUNDRED + romanAroundFifty(number - (number < 100 ? 90 : 100));
        }
        return actual;
    }

    private String romanAroundFifty(int number) {
        String actual;
        if (number < 40) {
            actual = romanAroundTen(number);
        } else {
            actual = (number < 50 ? ROMAN_TEN : "") + ROMAN_FIFTY + romanAroundTen(number - (number < 50 ? 40 : 50));
        }
        return actual;
    }

    private String romanAroundTen(int number) {
        String actual;
        if (number < 9) {
            actual = romanAroundFive(number);
        } else {
            actual = romanOnes(10 - number) + ROMAN_TEN + romanCalculator(number - 10);
        }
        return actual;
    }

    private String romanAroundFive(int number) {
        if (number < 4) {
            return romanComposition(ROMAN_ONE, number);
        } else {
            return romanComposition(ROMAN_ONE, ROMAN_FIVE.getRomanTokenValue() - number) + ROMAN_FIVE.getRomanToken() + romanComposition(ROMAN_ONE, number - ROMAN_FIVE.getRomanTokenValue());
        }

    }

    private String romanOnes(int number) {

        return romanComposition(ROMAN_ONE, number);
    }

    private String romanComposition(RomanToken romanToken, int number) {
        if (number < romanToken.getRomanTokenValue()) {
            return "";
        } else {
            return romanToken.getRomanToken() + romanComposition(romanToken, number - romanToken.getRomanTokenValue());
        }
    }

}
