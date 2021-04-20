package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanNumeralConverter {
    @Test
    public void testToIntConverter() {
        StringToRomanNumeralConverter converter = new StringToRomanNumeralConverter();
        int expected = 11;
        int actual = converter.convert("xi");
        Assertions.assertEquals(expected, actual);
    }
}
