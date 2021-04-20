package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanNumeralConverter {
    @Test
    public void testToIntConverter() {
        StringToRomanNumeralConverter converter = new StringToRomanNumeralConverter();
        int expected = 1;
        int actual = converter.convert("i");
        Assertions.assertEquals(expected, actual);
    }
}
