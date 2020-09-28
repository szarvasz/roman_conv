package hu.szarvasz.romanconv;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConverterTest {

    private Converter converter;

    @Before
    public void setUp(){
        converter = new Converter();
    }

    @Test
    public void test_I(){
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void test_II(){
        assertEquals("II", converter.convert(2));
    }

    @Test
    public void test_III(){
        assertEquals("III", converter.convert(3));
    }

    @Test
    public void test_IV(){
        assertEquals("IV", converter.convert(4));
    }

    @Test
    public void test_V(){
        assertEquals("V", converter.convert(5));
    }

    @Test
    public void test_VI(){
        assertEquals("VI", converter.convert(6));
    }

    @Test
    public void test_VIII(){
        assertEquals("VIII", converter.convert(8));
    }

    @Test
    public void test_IX(){
        assertEquals("IX", converter.convert(9));
    }

    @Test
    public void test_X(){
        assertEquals("X", converter.convert(10));
    }
}
