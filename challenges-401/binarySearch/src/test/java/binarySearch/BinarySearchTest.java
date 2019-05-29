package binarySearch;


import org.junit.Test;

import static binarySearch.BinarySearch.BinarySearch;
import static org.junit.Assert.*;


public class BinarySearchTest {
    @Test
    public void BinarySearchTest() {
        int[] testArray = new int[]{4,8,15,16,23,42};
        assertEquals("BinarySearch should return the correct index.", 2,
                BinarySearch(testArray, 15));
    }

    @Test
    public void BinarySearchTestNotFound() {
        int[] testArray = new int[]{4,8,15,16,23,42};
        assertEquals("BinarySearch should return the correct index.", -1,
                BinarySearch(testArray, 14));
    }

    @Test (expected = IllegalArgumentException.class)
    public void BinarySearchTestNull() {
        int[] testArray = null;
        BinarySearch(testArray, 0);
    }

    @Test
    public void BinarySearchTestOneValueFound() {
        int[] testArray = new int[]{4};
        assertEquals("BinarySearch should return the only index.", 0,
                BinarySearch(testArray, 4));
    }


    @Test
    public void BinarySearchTestEmptyArray() {
        int[] testArray = new int[]{};
        assertEquals("BinarySearch should not find the index.", -1,
                BinarySearch(testArray, 7));
    }
}
