package com.gamasoft.kata;

public class RomanToken {
    private final String romanToken;
    private final int romanTokenValue;
    private RomanToken previousToken;

    public RomanToken(String romanToken, int romanTokenValue, RomanToken previousToken) {
        this.romanToken = romanToken;
        this.romanTokenValue = romanTokenValue;
        this.previousToken = previousToken;
    }

    public String getRomanToken() {
        return romanToken;
    }

    public int getRomanTokenValue() {
        return romanTokenValue;
    }

    public RomanToken getPreviousToken() {
        return previousToken;
    }
}
