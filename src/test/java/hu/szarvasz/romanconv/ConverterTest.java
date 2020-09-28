package hu.szarvasz.romanconv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConverterTest {

    @Test
    public void testI(){
        assertEquals("I", Converter.convert(1));
    }
}
