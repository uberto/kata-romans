package com.gamasoft.kata;

public class RomanCalculator {

    private static final RomanToken ROMAN_EMPTY = new RomanToken("", 0, null, false);
    public static final RomanToken ROMAN_ONE = new RomanToken("I", 1, ROMAN_EMPTY, false);
    public static final RomanToken ROMAN_FIVE = new RomanToken("V", 5, ROMAN_ONE, false);
    public static final RomanToken ROMAN_TEN = new RomanToken("X", 10, ROMAN_FIVE, true);
    public static final RomanToken ROMAN_FIFTY = new RomanToken("L", 50, ROMAN_TEN, false);
    public static final RomanToken ROMAN_ONE_HUNDRED = new RomanToken("C", 100, ROMAN_FIFTY, true);
    public static final RomanToken ROMAN_FIVE_HUNDRED = new RomanToken("D", 500, ROMAN_ONE_HUNDRED, false);


    private static String composeRoman(RomanToken token, int number) {

        if (token.getPrev() == null) {
            return token.getRoman();
        } else if (number < token.getSubtractedValue()) {
            return composeRoman(token.getPrev(), number);
        } else if (number < token.getValue()) {
            return composeSubtractRoman(token, number);
        } else {
            return composeAdditionRoman(token, number);
        }
    }

    private static String composeAdditionRoman(RomanToken token, int number) {
        return token.getRoman() + composeRoman(token, number - token.getValue());
    }

    private static String composeSubtractRoman(RomanToken token, int number) {
        return token.getSubtractedRoman() + composeRoman(token, number - token.getSubtractedValue());
    }

    public static String calculate(int number) {
        return composeRoman(ROMAN_ONE_HUNDRED, number);
    }

    public static String calculate(int number, RomanToken romanToken) {
        return composeRoman(romanToken, number);
    }

}
