package sortingAlgo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortNull() {
        int[] test = new int[]{};
        MergeSort.mergeSort(test);
        assertEquals("Values should be the same.", Arrays.toString(new int[]{}), Arrays.toString(test));

    }

    @Test
    public void mergeSortOneValue(){
        int[] test = new int[]{2};
        MergeSort.mergeSort(test);
        assertTrue("One value should be the same.", Arrays.equals(new int[]{2}, test));
    }

    @Test
    public void mergeSortSorted(){
        int[] test = new int[]{2,5,6,8,20};
        int[] expected = new int[]{2,5,6,8,20};
        MergeSort.mergeSort(test);
        assertEquals("Values should be the same.", Arrays.toString(expected), Arrays.toString(test));

    }

    @Test
    public void mergeSortReverseSorted(){
        int[] test = new int[]{20,8,6,5,2};
        int[] expected = new int[]{2,5,6,8,20};
        MergeSort.mergeSort(test);
        assertEquals("Values should be the same.", Arrays.toString(expected), Arrays.toString(test));
    }

    @Test
    public void mergeSortUnsorted(){
        int[] test = new int[]{20,2,8,6,5};
        int[] expected = new int[]{2,5,6,8,20};
        MergeSort.mergeSort(test);
        assertEquals("Values should be the same.", Arrays.toString(expected), Arrays.toString(test));
    }
}