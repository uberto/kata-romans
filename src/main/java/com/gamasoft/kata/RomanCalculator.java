package com.gamasoft.kata;

public class RomanCalculator {
    private static final RomanToken ROMAN_EMPTY = new RomanToken("", 0, null, null);
    public static final RomanToken ROMAN_ONE = new RomanToken("I", 1, ROMAN_EMPTY, ROMAN_EMPTY);
    public static final RomanToken ROMAN_FIVE = new RomanToken("V", 5, ROMAN_ONE, ROMAN_ONE);
    public static final RomanToken ROMAN_TEN = new RomanToken("X", 10, ROMAN_FIVE, ROMAN_ONE);
    public static final RomanToken ROMAN_FIFTY = new RomanToken("L", 50, ROMAN_TEN, ROMAN_TEN);
    public static final RomanToken ROMAN_HUNDRED = new RomanToken("C", 100, ROMAN_FIFTY, ROMAN_TEN);

    private static String romanComposition(RomanToken romanToken, int number) {
        if (romanToken.getPreviousToken() == null){
            return romanToken.getRomanToken();
        } else if (number < romanToken.getRomanTokenValue()- romanToken.getSubtractableToken().getRomanTokenValue()) {
            return romanComposition(romanToken.getPreviousToken(), number);
        } else {
            return (number < romanToken.getRomanTokenValue() ? romanToken.getSubtractableToken().getRomanToken() : "") + romanToken.getRomanToken() + romanComposition(romanToken, number - romanToken.getRomanTokenValue() + (number < romanToken.getRomanTokenValue() ? romanToken.getSubtractableToken().getRomanTokenValue() : 0));
        }
    }

    public static String calculate(int number) {

        return romanComposition(ROMAN_HUNDRED, number);
    }
}
