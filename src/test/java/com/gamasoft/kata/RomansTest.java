package com.gamasoft.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomansTest {

    @Test
    public void oneIsI(){
        assertThat(romanOne(), is("I"));
    }

    @Test
    public void twoIsII(){
        assertThat(romanOnes(2), is("II"));
    }

    @Test
    public void threeIsIII(){
        assertThat(romanOnes(3), is("III"));
    }

    @Test
    public void fourIsIV(){
        assertThat(romanOnes(4), is("III"));
    }

    private String romanOnes(int number) {
        String two = "";
        for (int i = 0; i < number; i++) {
           two += romanOne();
        }
        return two;
    }

    private String romanOne() {
        return "I";
    }
}
