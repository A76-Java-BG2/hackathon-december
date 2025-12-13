package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    public static int[] add(int[] source, int element) {
        return new int[1];
    }

    public static int[] addFirst(int[] source, int element) {
        return new int[1];
    }

    public static int[] addAll(int[] source, int... elements) {
        return new int[1];
    }

    /**
     * Check if <code> element</code> is contained in the string.
     *
     * @param source The string in which we are searching for the element.
     * @param element The string we are looking for
     * @return boolean value which show us if the string is in the text.
     *
     * @author Mariyan Todorov
     */
    public static boolean contains(int[] source, int element) {
        boolean isContain = false;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == element){
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    /**
     * Create new array from other one.
     *
     * @param sourceArray The array to copy from
     * @param destinationArray The array to copy to
     * @param count The number of elements to copy
     * 
     *
     * @author Mariyan Todorov
     */
    public static void copy(int[] sourceArray, int[] destinationArray, int count) {
        for (int i = 0; i < count; i++) {
            if(i >= sourceArray.length){
                destinationArray[i] = 0;
            }else{
                destinationArray[i] = sourceArray[i];
            }
        }
    }
    /**
     * Copies elements from sourceArray, starting from sourceStartIndex into destinationArray,
     * starting from destStartIndex, taking count elements.
     *
     * @param sourceArray The array to copy from
     * @param sourceStartIndex The starting index in sourceArray
     * @param destinationArray The array to copy to
     * @param destStartIndex The starting index in destinationArray
     * @param count The number of elements to copy
     *
     *
     * @author Mariyan Todorov
     */
    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

            int destIndex = destStartIndex;
        for (int i = sourceStartIndex; i < count; i++) {
            destinationArray[destIndex] = sourceArray[i];
            destIndex++;
        }
    }

    public static void fill(int[] source, int element) {

    }

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] insert(int[] source, int index, int element) {
        return new int[1];
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {
        return new int[1];
    }

    public static void reverse(int[] arrayToReverse) {
    }

    public static int[] section(int[] source, int startIndex, int endIndex) {
        return new int[1];
    }

}
