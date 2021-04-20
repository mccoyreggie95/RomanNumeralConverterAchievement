package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestRomanNumeralConverter {
    @ParameterizedTest
    @CsvSource({"i,1","iv,4","v,5","viii,8","ix,9",
            "x,10","xi,11","xii,12","xx,20", "xl,40","xli,41",
            "l,50","xc,90", "xci,91","c,100", "ci,101",
            "cd,400", "cdi, 401","d,500", "cm,900",
            "cmi, 901", "m,1000","mi,1001","mmm,3000"})
    public void testToIntConverter(String query, int expected) {
        StringToRomanNumeralConverter converter = new StringToRomanNumeralConverter();
        int actual = converter.convert(query);
        Assertions.assertEquals(expected, actual);
    }
}
