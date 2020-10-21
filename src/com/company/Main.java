package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // PART 1
        // 1.1)
        float[] firstArray = new float[4]; // TODO init it's array by new with size 4.
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        // TODO insert some value to start of array and to end of array.

        int[] intArray = {1, 2, 3, 4}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, 4); // TODO copy "intArray". Use copyOf...

        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println("print \"intArrayCopy\", use Arrays toString. - " + Arrays.toString(intArrayCopy));
        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        if (Arrays.equals(intArray, intArrayCopy))
            System.out.println("Arrays equals");
        else
            System.out.println("Arrays not equals");

        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            //System.out.println(value + " ");
        }

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int sum = 0;

        for (int i : testArray)
            sum += testArray[i];
        System.out.println("calc sum of all array elements and print result. - " + sum);

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        sum = 0;

        for (int i = 0; i < testArray.length; i++)
            if (testArray[i] % 2 != 0)
                sum += testArray[i];

        System.out.println("calc sum of all numbers with odd indexes and print result. - " + sum);

        // 2.3)
        // TODO find max value in array.
        int max = testArray[0];
        for (int i : testArray)
            max = Math.max(max, i);

        System.out.println(max);

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        int[][] twoDimensional = new int[3][4];

        //3.2
        // TODO fill array with any numbers in cycles.
        Random random = new Random();
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional[i].length; j++) {
                twoDimensional[i][j] = random.nextInt(10) + 1;
            }
        }

        //3.3
        // TODO calc sum of all array elements and print result.
        sum = 0;
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional[i].length; j++) {
                sum += twoDimensional[i][j];
            }
        }
        System.out.println(sum);

        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        sum = 0;

        for (int i = 0; i < twoDimensional.length; i++) {
            System.out.println(Arrays.toString(twoDimensional[i]));
        }

        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        int maxInt = twoDimensional[0][0], minInt = twoDimensional[0][0];
        for (int[] ints : twoDimensional) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] >= 2) {
                    if (j % 3 == 0) {
                        maxInt = Math.max(maxInt, ints[j]);
                        minInt = Math.min(minInt, ints[j]);
                        sum += ints[j];
                    }
                }
            }
        }
        System.out.println(maxInt + minInt);
        System.out.println("sum - " + sum);
    }
}
