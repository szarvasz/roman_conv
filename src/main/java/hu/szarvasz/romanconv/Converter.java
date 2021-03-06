package hu.szarvasz.romanconv;

public class Converter {

    private String romanNum;

    private int[] VALUES = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] DIGITS = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String convert(int arabNum) {
        romanNum = "";
        int rest = arabNum;
        for (int i = 0; i < VALUES.length; i++){
            rest = appendRomanNum(rest, VALUES[i], DIGITS[i]);
        }
        return romanNum;
    }

    private int appendRomanNum(int arabNum, int value, String romanDigit){
        int rest = arabNum;
        while (rest >= value){
            romanNum += romanDigit;
            rest -= value;
        }
        return rest;
    }
}
