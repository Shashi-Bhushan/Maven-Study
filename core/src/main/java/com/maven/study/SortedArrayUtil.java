package com.maven.study;

/**
 * @author Shashi Bhushan
 *         Created on 11/9/16.
 *         For Project : Maven-Study
 */
public class SortedArrayUtil {

    public static int findElementInSortedAndRotatedArray(int[] array, int toSearch) {
        int N = array.length - 1 ;
        int pivot = findPivot(array);

        int startIndex = pivot,
            endIndex = N - pivot,
            midIndex;



        return -1;
    }

    /**
     * Array is sorted and Circularly rotated, with no duplicate elements.
     *
     * Finding the pivot is the problem here.
     *
     * 12, 15, 16, 18, 2, 5, 8, 9, 11
     * \            /     \         /
     *  Sorted       PIVOT Sorted
     * @param array
     * @return
     */
    public static int findPivot(int[] array){
        int N = array.length - 1;
        int startIndex = 0,
            endIndex = N,
            midIndex;

        while(startIndex <= endIndex){
            // Re-Evaluate Mid Index for every iteration
            midIndex = (startIndex + endIndex) / 2;


            // if Array is already sorted, return startIndex
            if(array[startIndex] <= array[endIndex]){
                return startIndex;
            }

            // Calculate next and Prev for next caluclation, keeping in mind the circular nature of array
            // Compensate for circular nature by taking the modulo with N
            int next = ( midIndex + 1 ) % N;
            int prev = ( midIndex - 1 + N ) % N;

            // if midIndex is smaller than both next and previous indexes, it's the Pivot ;)
            if( array[prev] >= array[prev] && array[midIndex] <= array[next]){
                return midIndex;
            }
            // If Left side of array is Sorted, then it does not have Pivot
            else if(array[startIndex] <= array[midIndex]){
                startIndex = midIndex + 1;
            }
            // If Left side of the array is sorted, then it does not have Pivot
            else if(array[midIndex] <= array[endIndex]){
                endIndex = midIndex - 1;
            }
        }

        return -1;
    }
}
