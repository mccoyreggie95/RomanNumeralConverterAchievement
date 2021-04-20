package bsu.edu.cs222;

public class StringToRomanNumeralConverter {
    public int convert(String stringQuery) {
        int finalInteger = 0;
        stringQuery = stringQuery.trim();
        stringQuery = stringQuery.toUpperCase();

        while (stringQuery.contains("CM")){
            finalInteger += 900;
            stringQuery = stringQuery.replaceFirst("CM","");
        }
        while (stringQuery.contains("M")){
            finalInteger += 1000;
            stringQuery = stringQuery.replaceFirst("M","");
        }
        while (stringQuery.contains("CD")){
            finalInteger += 400;
            stringQuery = stringQuery.replaceFirst("CD","");
        }
        while (stringQuery.contains("D")){
            finalInteger += 500;
            stringQuery = stringQuery.replaceFirst("D","");
        }
        while (stringQuery.contains("XC")){
            finalInteger += 90;
            stringQuery = stringQuery.replaceFirst("XC","");
        }
        while (stringQuery.contains("C")){
            finalInteger += 100;
            stringQuery = stringQuery.replaceFirst("C","");
        }
        while (stringQuery.contains("XL")){
            finalInteger += 40;
            stringQuery = stringQuery.replaceFirst("XL", "");
        }
        while (stringQuery.contains("L")){
            finalInteger += 50;
            stringQuery = stringQuery.replaceFirst("L", "");
        }
        while (stringQuery.contains("IX")){
            finalInteger += 9;
            stringQuery = stringQuery.replaceFirst("IX","");
        }
        while (stringQuery.contains("X")){
            finalInteger += 10;
            stringQuery = stringQuery.replaceFirst("X", "");
        }
        while (stringQuery.contains("IV")){
            finalInteger += 4;
            stringQuery = stringQuery.replaceFirst("IV","");
        }
        while (stringQuery.contains("V")){
            finalInteger += 5;
            stringQuery = stringQuery.replaceFirst("V","");
        }
        while (stringQuery.contains("I")){
            finalInteger += 1;
            stringQuery = stringQuery.replaceFirst("I","");
        }
        return finalInteger;
    }
}
