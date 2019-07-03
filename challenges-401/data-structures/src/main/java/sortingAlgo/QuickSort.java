package sortingAlgo;

public class QuickSort {

    //Method for quick sort
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int position = partition(arr, left, right);
            quickSort(arr, left, position -1 );
            quickSort(arr, position + 1, right);
        }
    }

    //Pivot is set to last element.
    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int low = left - 1;

        for(int i = left; i < right; i++){
            if(arr[i] <= pivot){
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low + 1);
        return low + 1;
    }

    //Swap two array values
    private static void swap(int[] arr, int i, int low){
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
