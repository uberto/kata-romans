package com.gamasoft.kata;

public class RomanCalculator {
    private static final RomanToken ROMAN_EMPTY = new RomanToken("", 0, null, false);
    public static final RomanToken ROMAN_ONE = new RomanToken("I", 1, ROMAN_EMPTY, false);
    public static final RomanToken ROMAN_FIVE = new RomanToken("V", 5, ROMAN_ONE, false);
    public static final RomanToken ROMAN_TEN = new RomanToken("X", 10, ROMAN_FIVE, true);
    public static final RomanToken ROMAN_FIFTY = new RomanToken("L", 50, ROMAN_TEN, false);
    public static final RomanToken ROMAN_HUNDRED = new RomanToken("C", 100, ROMAN_FIFTY, true);


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
        return token.getRoman() + composeRoman(token, number - token.getValue());
    }

    private static String composeSubtractRoman(RomanToken token, int number, RomanToken subtract) {
        return subtract.getRoman() + token.getRoman() + composeRoman(token, number - token.getValue() + subtract.getValue());
    }

    public static String calculate(int number) {
        return composeRoman(ROMAN_HUNDRED, number);
    }
}
