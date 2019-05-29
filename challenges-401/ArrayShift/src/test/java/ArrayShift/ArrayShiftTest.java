package ArrayShift;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    //Test for empty array
    @Test
    public void testInsertShiftArrayEmpty(){
        int[] inputArray = new int[]{};
        int[] expectedResult = new int[]{1};
        assertArrayEquals("array should contain the only inserted value", expectedResult,
                ArrayShift.insertShiftArray(inputArray, 1));
    }

    // Test for array with even length
    @Test
    public void testInsertShiftArrayEvenLength(){
        int[] inputArray = new int[]{2,4,6,8};
        int[] expectedResult = new int[]{2,4,5,6,8};
        assertArrayEquals("array should insert the value in the middle", expectedResult,
                ArrayShift.insertShiftArray(inputArray, 5));
    }

    // Test for array with odd length
    @Test
    public void testInsertShiftArrayOddLength(){
        int[] inputArray = new int[]{2,4,6,8,9};
        int[] expectedResult = new int[]{2,4,6,16,8,9};
        assertArrayEquals("array should insert the value in the middle", expectedResult,
                ArrayShift.insertShiftArray(inputArray, 16));
    }

    // Test for array with only one value
    @Test
    public void testInsertShiftArrayOneValue(){
        int[] inputArray = new int[]{12};
        int[] expectedResult = new int[]{12,22};
        assertArrayEquals("array should insert the value in the middle", expectedResult,
                ArrayShift.insertShiftArray(inputArray, 22));
    }
}
