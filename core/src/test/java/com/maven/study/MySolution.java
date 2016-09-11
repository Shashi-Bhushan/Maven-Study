package com.maven.study;

/**
 * @author Shashi Bhushan
 *         Created on 11/9/16.
 *         For Project : Maven-Study
 */
import java.util.*;
// Other imports go here

// Do NOT change the class name
// Do NOT change the class name
class MySolution {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int inputSize = Integer.parseInt(input.nextLine());


        while(inputSize-- > 0) {



            int inputNumber = Integer.parseInt(input.nextLine());

            System.out.println("InputNumber : " + inputNumber);
            int sqrt = squareRoot(inputNumber);

            int i = 2, output = 1;

            System.out.println("SQRT" + sqrt);
            while(i <= sqrt) {
                if(inputNumber %i == 0) {
                    output = output + (inputNumber / i) + i;
                }
            }

            System.out.println(inputSize + "|  " + output);
        }


    }

    private static int squareRoot(int number) {

        if (number == 1) {
            return 1;
        }

        int start = 0, end = number, mid = (start + end) / 2;

        int midSquare = mid * mid;

        while (midSquare != number) {
            if (midSquare > number) {
                end = mid - 1;
            } else if (midSquare < number) {
                start = mid + 1;
            }

            mid = (start + end) / 2;

            midSquare = mid * mid;
        }

        return mid;
    }
}