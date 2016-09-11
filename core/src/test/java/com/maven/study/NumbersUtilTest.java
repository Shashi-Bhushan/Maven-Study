package com.maven.study;

import org.junit.Test;

import java.util.*;

/**
 * @author Shashi Bhushan
 *         Created on 7/9/16.
 *         For Project : Maven-Study
 */
public class NumbersUtilTest {

    @Test
    public void decimalToBinaryTest(){
        assert(NumbersUtil.decimalToBinary(125, 10).equals(Arrays.asList(1,2,5)));
        List<Integer> list = new ArrayList<Integer>();
        NumbersUtil.decimalToBinaryRecurse(list, 125);

        assert(list.equals(Arrays.asList(1, 2, 5)));
    }

    @Test
    public void integerToString(){
        assert( NumbersUtil.integerToString(1254, 4).equals("1254")) ;
        assert( NumbersUtil.integerToStringDifferentImpl(1254, 4).equals("1254")) ;
    }

    @Test
    public void testDecimalToBinary() throws Exception {

    }

    @Test
    public void testDecimalToBinaryRecurse() throws Exception {

    }

    @Test
    public void testIntegerToStringDifferentImpl() throws Exception {

    }

    @Test
    public void testIsPrime() throws Exception {
//        assert(NumbersUtil.isPrime(7) == true);
//        assert(NumbersUtil.isPrime(6) == false);
        assert(NumbersUtil.isPrime(169) == false);
    }

    @Test
    public void testSquareRoot() throws Exception {
        assert( NumbersUtil.squareRoot(16.16f) == 4.0242186f);
        assert( NumbersUtil.squareRoot(4) == 2);
    }

    @Test

    public void testFindFactors() throws Exception{

        List list = NumbersUtil.findFactors(18);

        List compareList = Arrays.asList(1,2,3,3);
        assert (list.equals(compareList));
    }

    @Test
    public void testFindHCF(){
        assert (NumbersUtil.findHCF(60, 84) == 12);
    }

    @Test
    public void testFindLCM(){
        assert (NumbersUtil.findLCM(60, 84) == 420);
    }

    @Test
    public void testBinarySearch(){
        assert (NumbersUtil.binarySearch(new int[]{1,3,5} , 5) == 2);
        assert (NumbersUtil.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9} , 10) == -1);
    }
}
