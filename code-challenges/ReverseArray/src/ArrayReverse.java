/**
 * This program reverses the array.
 */

import java.util.Arrays;

public class ArrayReverse {
    public static void main (String[] args) {
        // create the array to test your code on later
        int[] startArr = new int[] {1,2,3,4,5,10};
        // print it out, nicely
        System.out.println(Arrays.toString(startArr));
        // call your reverseArray method and save the result in a variable
        int[] endArr = reverseArray(startArr);
        // print out the result, nicely
        System.out.println(Arrays.toString(endArr));
    }


    /**
     * Method to reverse the given array.
     * @param inputArray -  array to be reversed
     * @return result array
     */
    public static int[] reverseArray(int[] inputArray) {
        // result array
        int[] result = new int[inputArray.length];
        // pointer to last element of input array
        int end = inputArray.length - 1;
        // fill out result array by copying input array starting from the end
        for(int index = 0; index < inputArray.length; index++){
            //store current value of end index and decrement
            result[index] = inputArray[end--];
        }
        // return resulting array
        return result;
    }

}
