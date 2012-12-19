package com.gamasoft.kata;

public class RomanCalculator {
    private static final RomanToken ROMAN_EMPTY = new RomanToken("", 0, null, null);
    public static final RomanToken ROMAN_ONE = new RomanToken("I", 1, ROMAN_EMPTY, ROMAN_EMPTY);
    public static final RomanToken ROMAN_FIVE = new RomanToken("V", 5, ROMAN_ONE, ROMAN_ONE);
    public static final RomanToken ROMAN_TEN = new RomanToken("X", 10, ROMAN_FIVE, ROMAN_ONE);
    public static final RomanToken ROMAN_FIFTY = new RomanToken("L", 50, ROMAN_TEN, ROMAN_TEN);
    public static final RomanToken ROMAN_HUNDRED = new RomanToken("C", 100, ROMAN_FIFTY, ROMAN_TEN);


    private static String composeRoman(RomanToken token, int number) {

        RomanToken subtract = token.getSubtract();
        if (token.getPrev() == null) {
            return token.getRoman();
        } else if (number < token.getValue() - subtract.getValue()) {
            return composeRoman(token.getPrev(), number);
        } else if (number < token.getValue()) {
            return composeSubtractRoman(token, number, subtract);
        } else {
            return composeAdditionRoman(token, number);
        }
    }

    private static String composeAdditionRoman(RomanToken token, int number) {
        String postFix = composeRoman(token, number - token.getValue());
        return token.getRoman() + postFix;
    }

    private static String composeSubtractRoman(RomanToken token, int number, RomanToken subtract) {
        String prefix = subtract.getRoman();
        String postFix = composeRoman(token, number - token.getValue() + subtract.getValue());
        return prefix + token.getRoman() + postFix;
    }

    public static String calculate(int number) {
        return composeRoman(ROMAN_HUNDRED, number);
    }
}
