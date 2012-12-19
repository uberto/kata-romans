package com.gamasoft.kata;

public class RomanCalculator {
    private static final RomanToken ROMAN_EMPTY = new RomanToken("", 0, null, null);
    public static final RomanToken ROMAN_ONE = new RomanToken("I", 1, ROMAN_EMPTY, ROMAN_EMPTY);
    public static final RomanToken ROMAN_FIVE = new RomanToken("V", 5, ROMAN_ONE, ROMAN_ONE);
    public static final RomanToken ROMAN_TEN = new RomanToken("X", 10, ROMAN_FIVE, ROMAN_ONE);
    public static final RomanToken ROMAN_FIFTY = new RomanToken("L", 50, ROMAN_TEN, ROMAN_TEN);
    public static final RomanToken ROMAN_HUNDRED = new RomanToken("C", 100, ROMAN_FIFTY, ROMAN_TEN);

    private static String romanComposition(RomanToken romanToken, int number) {
        if (romanToken.getPrev() == null){
            return romanToken.getRoman();
        } else {
            return romanNumber(romanToken, number);
        }
    }

    private static String romanNumber(RomanToken romanToken, int number) {
        int value = romanToken.getValue();
        RomanToken subtract = romanToken.getSubtract();

        if (number < value - subtract.getValue()) {
            return romanComposition(romanToken.getPrev(), number);
        } else {
            String prefix = onlyIf(number < value, subtract.getRoman());
            String postFix = romanComposition(romanToken, number - value + onlyIf(number < value, subtract.getValue()));
            return prefix + romanToken.getRoman() + postFix;
        }
    }

    private static int onlyIf(boolean condition, int value) {
        return condition ? value : 0;
    }

    private static String onlyIf(boolean condition, String value) {
        return condition ? value : "";
    }

    public static String calculate(int number) {
        return romanComposition(ROMAN_HUNDRED, number);
    }
}
