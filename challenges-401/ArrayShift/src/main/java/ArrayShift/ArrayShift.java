/**
 * Code Challenge 2: Insert a value in the middle array.
 */
package ArrayShift;

public class ArrayShift {
    /**
     * Function to insert the given value to the middle of the array
     * @param input input array in which the value will be inserted
     * @param number number to be inserted to the middle of array
     * @return new array with the inserted value
     */
    public static int[] insertShiftArray(int[] input, int number){
        // Create result array
        int[] result = new int[input.length + 1];
        // Determine what will be the middle index
        int mid = ((input.length % 2) == 0) ? (input.length / 2) : ((input.length / 2) + 1);
        // index pointer for the input array
        int j = 0;

        //Loop through the result array
        for(int index = 0; index < result.length; index++){
            //If middle index, insert the passed value.
            if(index == mid){
                result[index] = number;
            //If not the middle index, copy the value from the input array
            } else {
                result[index] = input[j++];
            }
        }
        // Return the resulting array
        return result;
    }


}
