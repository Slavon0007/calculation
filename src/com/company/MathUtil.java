package com.company;

import java.util.Arrays;
import java.util.List;

public class MathUtil {
    private static final List<String> ROMAN_NUMBERS = Arrays.asList("I",
            "II", "III", "IV", "V", "VI", "VII", "VIII", "iX", "X");

    public static boolean isRoman(String operand) {
        return ROMAN_NUMBERS.indexOf(operand) > -1;
    }

    public static int getIntegerValue(String operand) {
        try {
            if (isRoman(operand)) {
                return ROMAN_NUMBERS.indexOf(operand) + 1;
            }

            return Integer.parseInt(operand);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Expression is not valid. Value is not a number");
        }
    }
}
