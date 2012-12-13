package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {

    @Test
    public void oneIsI(){
        String roman = "I";
        assertThat(roman, is("I"));
    }
}
