package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    /**
     * Abbreviates <code>source</code> to <code>maxLength</code> number of characters and adds ellipses.
     *
     * @param source The original string to modify
     * @param maxLength The maximum length of the resulting string
     * @return A string that represents the abbreviation of source with ellipses.
     *
     * @author Kalina Stefanova
     */

    public static String abbreviate(String source, int maxLength) {
        String result;
        if (maxLength > source.length()) {
            result = source;
        } else if (source.isEmpty()) {
            result = "";
        } else{
            result = source.substring(0,maxLength) + "...";
        }
        return result;
    }

    /**
     * Capitalizes the first character of <code>source</code>. If <code>source</code> is empty, returns empty string.
     *
     * @param source The original string to modify
     * @return The capitalized string or an empty string if <code>source</code> is an emptry string.
     *
     * @author Kalina Stefanova
     */

    public static String capitalize(String source) {

        if (!source.isEmpty()) {
            char firstChar = source.charAt(0);
            firstChar -= 32;
            source = firstChar + source.substring(1);
        }

        return source;
    }

    /**
     * Concatenates <code>string1</code> to <code>string2</code>.
     *
     * @param string1 The left part of the string
     * @param string2 The right part of the string
     * @return A string that represents the concatenation of <code>string1</code> followed by <code>string2<code>'s characters.
     *
     * @author Kalina Stefanova
     */


    public static String concat(String string1, String string2) {

        return string1 + string2;
    }

    public static boolean contains(String source, char symbol) {
        return false;
    }

    public static boolean endsWith(String source, char target) {
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        return 0;
    }

    public static int lastIndexOf(String source, char symbol) {
        return 0;
    }

    public static String pad(String source, int length, char paddingSymbol) {
        return null;

    }

    public static String padEnd(String source, int length, char paddingSymbol) {
        return null;
    }

    public static String padStart(String source, int length, char paddingSymbol) {
        return null;

    }

    public static String repeat(String source, int times) {
        return null;
    }

    public static String reverse(String source) {
        return null;
    }

    public static String section(String source, int start, int end) {
        return null;
    }

    public static boolean startsWith(String source, char target) {
        return false;
    }

}
