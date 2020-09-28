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
}
