package bsu.edu.cs222;

public class StringToRomanNumeralConverter {
    public int convert(String stringQuery) {
        int finalInteger = 0;
        stringQuery = stringQuery.trim();
        stringQuery = stringQuery.toUpperCase();

        if (stringQuery.contains("M")){
            finalInteger += 1000;
            stringQuery = stringQuery.replace("M","");
        }
        if (stringQuery.contains("CM")){
            finalInteger += 900;
            stringQuery = stringQuery.replace("CM","");
        }
        if (stringQuery.contains("D")){
            finalInteger += 500;
            stringQuery = stringQuery.replace("D","");
        }
        if (stringQuery.contains("CD")){
            finalInteger += 400;
            stringQuery = stringQuery.replace("CD","");
        }
        if (stringQuery.contains("C")){
            finalInteger += 100;
            stringQuery = stringQuery.replace("C","");
        }
        if (stringQuery.contains("XC")){
            finalInteger += 90;
            stringQuery = stringQuery.replace("XC","");
        }
        while (stringQuery.contains("L")){
            finalInteger += 50;
            stringQuery = stringQuery.replace("L", "");
        }
        if (stringQuery.contains("XL")){
            finalInteger += 40;
            stringQuery = stringQuery.replace("XL", "");
        }
        if (stringQuery.contains("X")){
            finalInteger += 10;
            stringQuery = stringQuery.replace("X","");
        }
        if (stringQuery.contains("IX")){
            finalInteger += 9;
            stringQuery = stringQuery.replace("IX", "");
        }
        if (stringQuery.contains("V")){
            finalInteger += 5;
            stringQuery = stringQuery.replace("V","");
        }
        if (stringQuery.contains("IV")){
            finalInteger += 4;
            stringQuery = stringQuery.replace("IV","");
        }
        if (stringQuery.contains("I")){
            finalInteger += 1;
            stringQuery = stringQuery.replace("I","");
        }
        return finalInteger;
    }
}


