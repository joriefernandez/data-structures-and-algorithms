package sortingAlgo;


public class InsertionSort {

    /**
     * Implementation of insertion algorithm
     * @param arr array to be sorted
     */
    public static int[] insertionSort(int[] arr){
        //Check if array is null, if so throw an error
        if(arr == null){
            throw new IllegalArgumentException("Null array cannot be sorted!");
        }

        //Loop through the array to perform insertion sort
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            //loop to determine where the current value will  inserted.
            while(j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = temp;
        }

        return arr;
    }
}
