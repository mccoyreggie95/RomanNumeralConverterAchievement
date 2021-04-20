package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestRomanNumeralConverter {
    @Test
    @ParameterizedTest
    @CsvSource({"i,1","iv,4","v,5","cdxcix, 499"})
    public void testToIntConverter(String query, int expected) {
        StringToRomanNumeralConverter converter = new StringToRomanNumeralConverter();
        int actual = converter.convert(query);
        Assertions.assertEquals(expected, actual);
    }
}
