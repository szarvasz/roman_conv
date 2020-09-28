package hu.szarvasz.romanconv;

public class Converter {

    public static String convert(int arabNum) {
        String romanNum = "";
        for (int i = 0; i < arabNum; i++) {
            romanNum += "I";
        }
        return romanNum;
    }
}
