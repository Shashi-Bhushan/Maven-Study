package com.maven.study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Shashi Bhushan
 *         Created on 7/9/16.
 *         For Project : Maven-Study
 */
public class NumbersUtil {

    /**
     * 125 = 10 * 12 + 5
     *       10 * ( (10 * 1) + 2) + 5
     * @param decimal
     * @return
     */
    public static List<Integer> decimalToBinary(int decimal, final int radix){
        StringBuilder builder = new StringBuilder();

        List<Integer> list = new LinkedList<Integer>();


        while(decimal > 0){
            int rem = decimal % radix;
            list.add(0, rem);
            builder.append(String.valueOf(rem));

            decimal = decimal / radix;
        }

        return list;
    }

    public static void decimalToBinaryRecurse(List<Integer> list, int decimal){
        if(decimal > 0) {
            int rem = decimal % 10;
            decimalToBinaryRecurse(list, decimal / 10);

            list.add(rem);
        }
    }

    public static String integerToString(int number, int length){

        char[] chars = new char[length];

        int charIndex = 0;

        while(number > 0){
            char rem = (char)(number % 10 + '0');

            chars[charIndex++] = rem;

            number = number / 10;
        }

        for(int index = 0; index < charIndex / 2; index++){
            char temp = chars[index];
            chars[index] = chars[charIndex - index - 1];
            chars[charIndex - index - 1] = temp;
        }

        return new String(chars);
    }

    public static String integerToStringDifferentImpl(int number, int length){
        char[] chars = new char[length];

        // can do length-- here for further optimization
        while(length > 0){
// Another Way is to have a mapping for radix greater than 10
            char rem = "0123456789ABCDEF".charAt(number % 10);

            chars[length-1] = rem;
            length--;
            number = number / 10;
        }

        return new String(chars);

    }

    public static boolean isPrime(int number){


        return false;
    }

    /**
     * 1. Initialize, start = 0, end = number, mid = (start+end)/2.

     3. Find diff = difference between number  and mid * mid.

     4. While difference is not in range 0.05,

     repeat the following steps:

     a. If mid*mid > number, then the square root will be less than mid. So, set end = mid.

     b. Else, the square root will be greater than mid. So, set start = mid.

     d. Re-evaluate mid  = (start+end)/2.

     e. Re-evaluate midSquare
     * @param number
     * @return
     */
    public static float squareRoot(float number){
        float start = 0, end = number, mid = (start + end) / 2;

        float midSquare;

        while( (midSquare = mid * mid) - number > 0.05 || number - (midSquare = mid * mid) > 0.05 ){
            if(midSquare > number){
                end = mid;
            } else if(midSquare < number){
                start = mid;
            }

            mid = (start + end) / 2;
        }

        return mid;
    }
}
