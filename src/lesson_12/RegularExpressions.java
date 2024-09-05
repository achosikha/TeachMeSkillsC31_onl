package lesson_12;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        // What are regular expressions?
        // Why do we need them?

        // String -> archil Sikharulidze a.sikharulidze@gmail.com
        // regex -> get post
        // regex -> Ar Sik skjauAr -> get only low case letters
        // template -> a-z{2, 6} ....

        String expression = "45+3/7-9*10%3";

        // / or + or - or % or *
        // if || -> regex |
        // String[] expressionSplit = expression.split("/|\\+|-|%|\\*");

        // [] -> everything that is inside
        String[] expressionSplit = expression.split("[+-/*%]");

        System.out.println(Arrays.deepToString(expressionSplit));

        String replaceFruits = "Banana Potato Apple Carrot Cherry";
        System.out.println(replaceFruits.replaceAll("Banana|Apple|Cherry", "Fruits"));

        // Pattern creates template of regular expression
        // Mather checks if the pattern is found
    }
}
