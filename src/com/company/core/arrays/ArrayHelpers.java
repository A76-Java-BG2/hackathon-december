package com.company.core.arrays;

import java.util.ArrayList;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    /**
     * Adds <code>element</code> to the end of <code>source</code>.
     *
     * @param element The array to add to
     * @param source The element to add
     * @return A new array, the original array <code>source</code> with <code>element</code> at the end.
     *
     * @author Kalina Stefanova
     */

    public static int[] add(int[] source, int element) {
        int[] result = new int[source.length + 1];

        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }

        result[result.length - 1] = element;

        return result;
    }

    /**
     * Adds <code>element</code> at the start of <code>source</code>.
     *
     * @param source The array to add to
     * @param element The element to add
     * @return A new array, the original array <code>source</code> with <code>element</code> at head position.
     *
     * @author Kalina Stefanova
     */

    public static int[] addFirst(int[] source, int element) {
        int[] result = new int[source.length + 1];

        for (int i = 1; i <= source.length; i++) {
            result[i] = source[i-1];
        }

        result[0] = element;

        return result;

    }

    /**
     * Adds all <code>elements</code> to the end of <code>source</code>.
     *
     * @param source The array to add to
     * @param elements The elements to add
     * @return A new array, the original array <code>source</code> with all <code>elements</code> at the end.
     *
     * @author Kalina Stefanova
     */

    public static int[] addAll(int[] source, int... elements) {
        int[] result = new int[source.length + elements.length];

        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }

        int elementsIndex = 0;

        for (int i = source.length; i < result.length; i++) {
            result[i] = elements[elementsIndex++];
        }

        return result;
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

    /**
     * *Fills `source` with `element`.*
     *
     * @param source The array to fill
     * @param element The element to fill with
     *
     * @author Spasimira Genova
     */

    public static void fill(int[] source, int element) {
        for (int i = 0; i < source.length; i++) {
            source[i] = element;
        }
    }

    /**
     * Finds the first index of `target` within `source`
     *
     * @param source The array to check in
     * @param target The element to check for
     * @return The first index of `target` within `source`, otherwise, -1
     *
     * @author Spasimira Genova
     */

    public static int firstIndexOf(int[] source, int target) {
        int searchedIndex = -1;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == target) {
                searchedIndex = i;
                break;
            }
        }
        return searchedIndex;
    }

    /**
     * Inserts `element` at index `index` in `source`.
     *
     * @param source The array to insert in
     * @param index The index to insert at
     * @param element The element to insert
     * @return A new array with `element` in it
     *
     * @author Spasimira Genova
     */

    public static int[] insert(int[] source, int index, int element) {
        ArrayList<Integer> listWithNewElement = new ArrayList<>();
        for (int j : source) {
            listWithNewElement.add(j);
        }

        listWithNewElement.add(index, element);

        int [] arrayWithNewElement = new int [listWithNewElement.size()];
        for (int i = 0; i < listWithNewElement.size(); i++) {
            arrayWithNewElement[i] = listWithNewElement.get(i);
        }

        return arrayWithNewElement;
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
