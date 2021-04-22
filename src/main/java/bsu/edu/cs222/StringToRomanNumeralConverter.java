package bsu.edu.cs222;

import java.util.*;

public class StringToRomanNumeralConverter {
    public int convert(String stringQuery) {
        stringQuery = stringQuery.trim();
        stringQuery = stringQuery.toUpperCase();
        int finalInteger = 0;

        Map<String, Integer> map = new HashMap<>();
        //map.put("CM", 900);
        map.put("M", 1000);
        //map.put("CD", 400);
        map.put("D", 500);
        //map.put("XC", 90);
        map.put("C", 100);
        //map.put("XL", 40);
        map.put("L", 50);
        //map.put("IX", 9);
        map.put("X", 10);
        //map.put("IV", 4);
        map.put("V", 5);
        map.put("I", 1);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String key = e.getKey();
            Integer value = e.getValue();
            while (stringQuery.contains(key)) {
                if (stringQuery.indexOf(key) != 0) {
                    int indexBeforeKey = stringQuery.indexOf(key) - 1;
                    String letterBeforeKey = String.valueOf(stringQuery.charAt(indexBeforeKey));
                    int letterBeforeKeyValue = map.get(letterBeforeKey);
                    if (value > letterBeforeKeyValue) {
                        int difference = value - letterBeforeKeyValue;
                        finalInteger += difference;
                        stringQuery = stringQuery.replaceFirst(key, "");
                        stringQuery = stringQuery.replaceFirst(letterBeforeKey, "");
                    } else if (value < letterBeforeKeyValue) {
                        finalInteger = finalInteger + value + letterBeforeKeyValue;
                        stringQuery = stringQuery.replaceFirst(key, "");
                        stringQuery = stringQuery.replaceFirst(letterBeforeKey, "");
                    }

                } else if (stringQuery.indexOf(key) == 0) {
                    int indexAfterKey = stringQuery.indexOf(key) + 1;
                    String letterAfterKey = String.valueOf(stringQuery.charAt(indexAfterKey));
                    int letterAfterKeyValue = map.get(letterAfterKey);
                    if (value < letterAfterKeyValue) {
                        int difference = letterAfterKeyValue - value;
                        finalInteger += difference;
                        stringQuery = stringQuery.replaceFirst(key, "");
                        stringQuery = stringQuery.replaceFirst(letterAfterKey, "");
                    }

                }else {
                    finalInteger += value;
                    stringQuery = stringQuery.replaceFirst(key, "");
                }
            }
        }
        if (finalInteger > 3000 || finalInteger <= 0) {
            System.out.println("Query out of scope or invalid");
        }

        return finalInteger;
    }
}
