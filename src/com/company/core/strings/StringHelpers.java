package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    public static String abbreviate(String source, int maxLength) {
        return null;
    }

    public static String capitalize(String source) {
        return null;
    }

    public static String concat(String string1, String string2) {
        return null;
    }

    /**
     * Checks if source contains a symbol.
     *
     * @param source The string to check
     * @param symbol The character to check for
     * @return  true if symbol is within source or false if not
     *
     * @author Mariyan Todorov
     */
    public static boolean contains(String source, char symbol) {
        boolean isContains = false;

        for (int i = 0; i < source.length(); i++) {
            char temp = source.charAt(i);
            if(temp == symbol){
                isContains = true;
                break;
            }
        }
        return isContains;
    }
    /**
     * Checks if the string source ends with the given character.
     *
     * @param source The string to check
     * @param target The character to check for
     * @return  true if the string ends with target, else false
     *
     * @author Mariyan Todorov
     */
    public static boolean endsWith(String source, char target) {
        boolean isEndsWith = false;
        if(source.length() != 0){
            char lastLetter = source.charAt(source.length() - 1);
            if(lastLetter == target){
                isEndsWith = true;
            }
        }
        return isEndsWith;
    }
    /**
     * Finds the first index of target within source
     *
     * @param source The string to check
     * @param target The character to check for
     * @return The first index of target within source, otherwise, -1
     *
     * @author Mariyan Todorov
     */
    public static int firstIndexOf(String source, char target) {

        for (int i = 0; i < source.length(); i++) {
            if(target == source.charAt(i)){
                return i;
            }
        }
        return -1;
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
