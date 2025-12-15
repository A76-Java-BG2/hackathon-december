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

    /**
     * Finds the last index of `target` within `source`.
     *
     * @param source The string to check
     * @param symbol The character to check for
     * @return The last index `symbol` within `source` or -1 if no match
     *
     * @author Spasimira Genova
     */

    public static int lastIndexOf(String source, char symbol) {
        int searchedIndex = -1;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == symbol) {
                searchedIndex = i;
            }
        }

        return searchedIndex;
    }

    /**
     * Pads string on the left and right sides if it's shorter than length.
     *
     * @param source The string to pad
     * @param length The length of the string to achieve
     * @param paddingSymbol - The character used as padding
     * @return The padded string
     *
     * @author Spasimira Genova
     */


    public static String pad(String source, int length, char paddingSymbol) {
        String paddedString = source;
        if (source.length() < length) {
            int lengthDiff = length - source.length();
            int lengthEachSide = lengthDiff / 2;
            int counter = 0;
            while (counter != lengthEachSide) {
                paddedString = paddingSymbol + paddedString;
                paddedString = paddedString + paddingSymbol;
                counter++;
            }
        }

        return paddedString;
    }

    /**
     * Pads `source` on the right side with `paddingSymbol` enough times to reach length `length`.
     *
     * @param source The string to pad
     * @param length The length of the string to achieve
     * @param paddingSymbol - The character used as padding
     * @return The padded string
     *
     * @author Spasimira Genova
     */

    public static String padEnd(String source, int length, char paddingSymbol) {
        String paddedStringEnd = source;
        if (source.length() < length) {
            int counter = 0;
            int lengthDiff = length - source.length();
            while (counter != lengthDiff) {
                paddedStringEnd = paddedStringEnd + paddingSymbol;
                counter++;
            }
        }

        return paddedStringEnd;
    }

    /**
     * Pads <code>source</code> on the left side with <code>paddingSymbol</code> enough times to reach length <code>length</code>.
     *
     * @param source The string to pad
     * @param length The length of the string to achieve
     * @param paddingSymbol The character used as padding
     * @return The padded string
     *
     * @author Alex Valtchev
     */
    public static String padStart(String source, int length, char paddingSymbol) {
        if (source == null) {
            return null;
        }

        if (source.length() >= length) {
            return source;
        }

        int paddingCount = length - source.length();
        char[] result = new char[length];

        for (int i = 0; i < paddingCount; i++) {
            result[i] = paddingSymbol;
        }

        for (int i = 0; i < source.length(); i++) {
            result[paddingCount + i] = source.charAt(i);
        }

        return new String(result);
    }

    /**
     * Repeats <code>source</code> <code>times</code> times.
     *
     * @param source The string to repeat
     * @param times The number of repetitions
     * @return A new string containing source repeated times times
     *
     * @author Alex Valtchev
     */
    public static String repeat(String source, int times) {
        if (source == null) {
            return null;
        }

        if (times <= 0 || source.length() == 0) {
            return "";
        }

        int sourceLength = source.length();
        char[] result = new char[sourceLength * times];
        int index = 0;

        for (int t = 0; t < times; t++) {
            for (int i = 0; i < sourceLength; i++) {
                result[index] = source.charAt(i);
                index++;
            }
        }

        return new String(result);
    }
    /**
     * Reverses the characters of the given string.
     *
     * @param source The original string to reverse
     * @return A new string where the characters of source are in reverse order
     *
     * @author Sayret Meyzinev
     */
    public static String reverse(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }

        String result = "";

        for (int i = source.length() - 1; i >= 0; i--) {
            result += source.charAt(i);
        }

        return result;
    }
    /**
     * Extracts a section of the string between two indices.
     *
     * @param source The original string
     * @param start The starting index (inclusive)
     * @param end The ending index (inclusive)
     * @return A new string containing the characters from start to end
     *
     * @author Sayret Meyzinev
     */

    public static String section(String source, int start, int end) {
        if (source == null || source.isEmpty()) {
            return "";
        }

        if (start < 0 || end < start || start >= source.length()) {
            return source;
        }

        if (end >= source.length()) {
            end = source.length() - 1;
        }

        return source.substring(start, end + 1);
    }

    /**
     * Checks whether <code>source</code> starts with the given character.
     *
     * @param source The string to check
     * @param target The character to check for
     * @return True if source starts with target, otherwise false
     *
     * @author Alex Valtchev
     */
    public static boolean startsWith(String source, char target) {
        if (source == null || source.length() == 0) {
            return false;
        }

        return source.charAt(0) == target;
    }

}
