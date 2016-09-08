package com.maven.study;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void squareRootTest(){
        assert( NumbersUtil.squareRoot(16.16f) == 4.0242186f);
        assert( NumbersUtil.squareRoot(4) == 2);
    }
}
