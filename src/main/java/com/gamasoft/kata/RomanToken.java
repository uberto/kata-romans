package com.gamasoft.kata;

public class RomanToken {
    private final String romanToken;
    private final int romanTokenValue;
    private RomanToken previousToken;
    private RomanToken subtractableToken;

    public RomanToken(String romanToken, int romanTokenValue, RomanToken previousToken, boolean twoStepsSubtractable) {
        this.romanToken = romanToken;
        this.romanTokenValue = romanTokenValue;
        this.previousToken = previousToken;

        this.subtractableToken = twoStepsSubtractable ? previousToken.getPrev() : previousToken;
    }

    public String getSubtractedRoman() {
        return getSubtract().getRoman() + getRoman();
    }

    public int getSubtractedValue() {
        return getValue() - getSubtract().getValue();
    }

    public String getRoman() {
        return romanToken;
    }

    public int getValue() {
        return romanTokenValue;
    }

    public RomanToken getPrev() {
        return previousToken;
    }

    public RomanToken getSubtract() {
        return subtractableToken;
    }
}
