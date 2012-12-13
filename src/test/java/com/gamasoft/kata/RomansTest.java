package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {

    @Test
    public void oneIsI(){
        assertThat(roman(1), is("I"));
    }

    @Test
    public void twoIsII(){
        String two = "";
        int number = 2;
        for (int i = 0; i < number; i++) {
           two += roman(1);
        }
        assertThat(two, is("II"));
    }

    private String roman(int i) {
        return "I";
    }
}
