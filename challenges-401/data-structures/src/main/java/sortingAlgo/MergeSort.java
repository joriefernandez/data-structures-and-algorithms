package sortingAlgo;

import java.util.Arrays;

public class MergeSort {

    /**
     * Merge sort implementation
     * @param arr array to be sorted
     */
    public static void mergeSort(int[] arr){

        int n = arr.length;

        if(arr.length > 1){
            int mid = n/2;
            int[] b = Arrays.copyOfRange(arr, 0, mid);
            int[] c = Arrays.copyOfRange(arr, mid , n);

            mergeSort(b);
            mergeSort(c);
            arr = merge(b, c, arr);
        }

    }

    //Helper method to merge
    private static int[] merge(int[] b, int[] c, int[] arr){
        int i = 0, j = 0,  k = 0;

        while (i < b.length && j < c.length){
            if(b[i] <= c[j]){
                arr[k] = b[i];
                i += 1;
            } else {
                arr[k] = c[j];
                j += 1;
            }
            k += 1;
        }

        while (i < b.length) {
            arr[k++] = b[i++];
        }

        while (j < c.length) {
            arr[k++] = c[j++];
        }

        return arr;
    }
}
