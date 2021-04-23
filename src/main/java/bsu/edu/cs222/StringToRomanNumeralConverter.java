package bsu.edu.cs222;

import java.util.*;

public class StringToRomanNumeralConverter {
    public int convert(String stringQuery) {
        stringQuery = stringQuery.trim();
        stringQuery = stringQuery.toUpperCase();
        int finalInteger = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        for (int i=0; i < stringQuery.length();i++){
            if (i > 0 && map.get(stringQuery.charAt(i)) > map.get(stringQuery.charAt(i-1))){
                finalInteger += map.get(stringQuery.charAt(i)) - (2 * map.get(stringQuery.charAt(i-1)));
            }
            else finalInteger += map.get(stringQuery.charAt(i));
        }
        return finalInteger;
    }
}
