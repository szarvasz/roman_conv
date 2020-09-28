package hu.szarvasz.romanconv;

public class Converter {

    public static String convert(int arabNum) {
        String romanNum = "";
        int rest = arabNum;
        if (rest >= 5){
            romanNum = "V";
            rest -= 5;
        }
        if (rest == 4){
            romanNum = "IV";
            rest -= 4;
        }
        for (int i = 0; i < rest; i++) {
            romanNum += "I";
        }

        return romanNum;
    }
}
