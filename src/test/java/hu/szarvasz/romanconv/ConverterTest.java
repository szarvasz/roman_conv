package hu.szarvasz.romanconv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConverterTest {

    @Test
    public void test_I(){
        assertEquals("I", Converter.convert(1));
    }

    @Test
    public void test_II(){
        assertEquals("II", Converter.convert(2));
    }

    @Test
    public void test_III(){
        assertEquals("III", Converter.convert(3));
    }

    @Test
    public void test_IV(){
        assertEquals("IV", Converter.convert(4));
    }

    @Test
    public void test_V(){
        assertEquals("V", Converter.convert(5));
    }

    @Test
    public void test_VI(){
        assertEquals("VI", Converter.convert(6));
    }

    @Test
    public void test_VIII(){
        assertEquals("VIII", Converter.convert(8));
    }
}
