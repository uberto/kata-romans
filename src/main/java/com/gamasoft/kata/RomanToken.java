package com.gamasoft.kata;

public class RomanToken {
    private final String romanToken;
    private final int romanTokenValue;

    public RomanToken(String romanToken, int romanTokenValue) {
        this.romanToken = romanToken;
        this.romanTokenValue = romanTokenValue;
    }

    public String getRomanToken() {
        return romanToken;
    }

    public int getRomanTokenValue() {
        return romanTokenValue;
    }
}
