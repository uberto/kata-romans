package com.gamasoft.kata;

public class RomanToken {
    private final String romanToken;
    private final int romanTokenValue;
    private RomanToken previousToken;
    private RomanToken subtractableToken;

    public RomanToken(String romanToken, int romanTokenValue, RomanToken previousToken, RomanToken subtractableToken) {
        this.romanToken = romanToken;
        this.romanTokenValue = romanTokenValue;
        this.previousToken = previousToken;
        this.subtractableToken = subtractableToken;
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

    public RomanToken getSubtractableToken() {
        return subtractableToken;
    }
}
