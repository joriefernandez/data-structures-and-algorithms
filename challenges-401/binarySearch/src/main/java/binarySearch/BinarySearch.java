package binarySearch;

public class BinarySearch {
    /**
     * Function to search value using binary search algorithm.
     * @param sortedArray array to be searched
     * @param target search key value
     * @return index if value found
     *         -1 if value not in the array
     */
    public static int BinarySearch(int[] sortedArray, int target){
        //Check if the array is not null
        if(sortedArray == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }

        // Set left and right index
        int left = 0;
        int right = sortedArray.length - 1;

        //Iterate through the loop
        while(left <= right){
            int mid = left + right / 2;

            if(sortedArray[mid] < target){
                left = mid + 1;
            } else if(sortedArray[mid] > target){
                right = mid - 1;
            } else {
                return mid;
            }
        }

        // Return -1 if not found
        return -1;

    }
}