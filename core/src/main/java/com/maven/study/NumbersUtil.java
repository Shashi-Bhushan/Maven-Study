package com.maven.study;

import java.util.*;

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

        int sqrt = (int)squareRoot(number);

        int i = 2;
        boolean isPrime = true;

        while(i < sqrt){
            if(number % i++ == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
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

    public static List<Integer> findFactors(int number) {
        int sqrt = (int)squareRoot(number);

        List<Integer> list = new LinkedList<Integer>();

        // list will always have 1 factor
        list.add(1);
        int i = 2;

        while(i <= sqrt){
            while(number % i == 0){
                list.add(i);
                number = number / i;
            }

            i++;
        }

        return list;
    }

    /**
     * Go only till the square root of the least number
     * keep multiplying the same i with numbers till it's perfectly divisible
     * @param number1
     * @param number2
     * @return
     */
    public static int findHCF(int number1, int number2){
        int least = number1 < number2 ? number1 : number2;

        int sqrt = (int)squareRoot(least);

        int i = 2;

        int hcf = 1;

        while(i <= sqrt){
            while(number1 % i == 0 && number2 % i == 0){
                hcf = hcf * i;

                number1 = number1 / i;
                number2 = number2 / i;
            }
            i++;
        }

        return hcf;
    }

    public static int findLCM(int number1, int number2) {
        int least = number1 < number2 ? number1 : number2;

        int sqrt = (int)squareRoot(least);

        int i = 2;

        int lcm = 1;

        while(i <= sqrt) {
            while(number1 % i == 0 && number2 % i == 0) {
                lcm = lcm * i;

                number1 = number1 / i;
                number2 = number2 / i;
            }

            i++;
        }

        lcm = lcm * number1 * number2;

        return lcm;
    }

    public static int binarySearch(int[] array, int toSearch) {

        int startIndex = 0, endIndex = array.length -1, midIndex = ( startIndex + endIndex ) / 2;

        while( startIndex <= endIndex){
            if( array[midIndex] < toSearch){
                startIndex = midIndex + 1;
            }else if(toSearch < array[midIndex]){
                endIndex = midIndex - 1;
            } else if(array[midIndex] == toSearch){
                return midIndex;
            }

            midIndex = (startIndex + endIndex) / 2;
        }


        return -1;
    }

    public static int binarySearchWithSearchType(int[] array, int toSearch, BinarySearchType searchType){
        int startIndex = 0, endIndex = array.length - 1, midIndex = ( startIndex + endIndex ) / 2;

        int position = -1;

        while(startIndex <= endIndex){
            if(array[midIndex] < toSearch){
                startIndex = midIndex + 1;
            }else if(toSearch < array[midIndex]){
                endIndex = midIndex - 1;
            }else if(array[midIndex] == toSearch){
                position = midIndex;
                switch(searchType){
                    case FIRST_OCCURENCE:
                        endIndex = midIndex - 1;
                        break;
                    case LASTOCCURENCE:
                        startIndex = midIndex + 1;
                        break;
                    case NORMAL:
                        return position;
                }
            }

            midIndex = (startIndex + endIndex) / 2;
        }

        return position;
    }

    public enum BinarySearchType{
        NORMAL,
        FIRST_OCCURENCE,
        LASTOCCURENCE
    }

    public static class FactorModal{
        private int firstNumber;
        private int secondNumber;

        public FactorModal(int firstNumber, int secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }

        public int getFirstNumber() {
            return firstNumber;
        }

        public FactorModal setFirstNumber(int firstNumber) {
            this.firstNumber = firstNumber;
            return this;
        }

        public int getSecondNumber() {
            return secondNumber;
        }

        public FactorModal setSecondNumber(int secondNumber) {
            this.secondNumber = secondNumber;
            return this;
        }
    }
}
