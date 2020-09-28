package hu.szarvasz.romanconv;

public class Converter {

    private String romanNum;

    public String convert(int arabNum) {
        romanNum = "";
        int rest = arabNum;
        rest = appendRomanNum(rest, 5, "V");
        rest = appendRomanNum(rest, 4, "IV");
        for (int i = 0; i < rest; i++) {
            romanNum += "I";
        }
        return romanNum;
    }

    private int appendRomanNum(int arabNum, int value, String romanDigit){
        int rest = arabNum;
        if (rest >= value){
            romanNum += romanDigit;
            rest -= value;
        }
        return rest;
    }
}
