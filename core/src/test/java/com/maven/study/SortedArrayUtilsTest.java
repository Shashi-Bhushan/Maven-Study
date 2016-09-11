package com.maven.study;

import org.junit.Test;

/**
 * @author Shashi Bhushan
 *         Created on 11/9/16.
 *         For Project : Maven-Study
 */
public class SortedArrayUtilsTest {

    @Test
    public void testFindElementInSortedAndRotatedArray(){
//        int index = SortedArrayUtil.findElementInSortedAndRotatedArray(new int[]{4,5,6,8,1,2,3}, 5);
//
//        assert (index == 1);
//
//        assert ( SortedArrayUtil.findElementInSortedAndRotatedArray(new int[]{4,5,6,8,1,2,3}, 3) == 6);
    }

    public void testFindPivot(){
        int pivot = SortedArrayUtil.findPivot(new int[]{4,5,6,7,9,2,3});

        assert (pivot == 5);
    }
}
