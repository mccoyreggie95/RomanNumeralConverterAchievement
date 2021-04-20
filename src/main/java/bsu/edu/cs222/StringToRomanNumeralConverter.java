package bsu.edu.cs222;

public class StringToRomanNumeralConverter {
    public int convert(String stringQuery) {
        int finalInteger = 0;
        stringQuery = stringQuery.trim();
        stringQuery = stringQuery.toUpperCase();

        while (stringQuery.contains("CM")){
            finalInteger += 900;
            stringQuery = stringQuery.replace("CM","");
        }
        while (stringQuery.contains("M")){
            finalInteger += 1000;
            stringQuery = stringQuery.replace("M","");
        }
        while (stringQuery.contains("CD")){
            finalInteger += 400;
            stringQuery = stringQuery.replace("CD","");
        }
        while (stringQuery.contains("D")){
            finalInteger += 500;
            stringQuery = stringQuery.replace("D","");
        }
        while (stringQuery.contains("XC")){
            finalInteger += 90;
            stringQuery = stringQuery.replace("XC","");
        }
        while (stringQuery.contains("C")){
            finalInteger += 100;
            stringQuery = stringQuery.replace("C","");
        }
        while (stringQuery.contains("XL")){
            finalInteger += 40;
            stringQuery = stringQuery.replace("XL", "");
        }
        while (stringQuery.contains("L")){
            finalInteger += 50;
            stringQuery = stringQuery.replace("L", "");
        }
        while (stringQuery.contains("IX")){
            finalInteger += 9;
            stringQuery = stringQuery.replace("IX","");
        }
        while (stringQuery.contains("X")){
            finalInteger += 10;
            stringQuery = stringQuery.replace("X", "");
        }
        while (stringQuery.contains("IV")){
            finalInteger += 4;
            stringQuery = stringQuery.replace("IV","");
        }
        while (stringQuery.contains("V")){
            finalInteger += 5;
            stringQuery = stringQuery.replace("V","");
        }
        while (stringQuery.contains("I")){
            finalInteger += 1;
            stringQuery = stringQuery.replace("I","");
        }
        return finalInteger;
    }
}
