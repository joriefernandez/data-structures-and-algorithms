package hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HashTableTest {

    private static final int ARRAY_SIZE = 4;

    private HashTable<String, Integer> test;

    @Before
    public void init(){
        test = new HashTable<String, Integer>(ARRAY_SIZE);
    }

    /****************************************** TEST ADD FUNCTION **********************************************/
    @Test
    public void addToEmptyTable() {
       test.add("First", 2);
       String[] keys = new String[ARRAY_SIZE];
       Integer[] vals = new Integer[ARRAY_SIZE];
       keys[0] = "First";
       vals[0] = 2;

       assertEquals("key value should be added", Arrays.toString(keys), Arrays.toString(test.keys) );
       assertEquals("key value should be added", Arrays.toString(vals), Arrays.toString(test.values) );
       assertEquals("key-value number should be updated", 1, test.keyValueNum);

    }

    @Test
    public void addToNonEmptyTable() {
        String[] keys = new String[ARRAY_SIZE];
        Integer[] vals = new Integer[ARRAY_SIZE];
        keys[0] = "First";
        keys[2] = "Another key";
        vals[0] = 2;
        vals[2] = 24;


        test.add("First", 2);
        test.add("Another key", 24);
        assertEquals("key value should be added", Arrays.toString(keys), Arrays.toString(test.keys) );
        assertEquals("key value should be added", Arrays.toString(vals), Arrays.toString(test.values) );
        assertEquals("key-value number should be updated", 2, test.keyValueNum);

    }

    @Test
    public void addExistingKey() {
        String[] keys = new String[ARRAY_SIZE];
        Integer[] vals = new Integer[ARRAY_SIZE];
        keys[0] = "First";
        vals[0] = 24;


        test.add("First", 2);
        test.add("First", 24);
        assertEquals("key value should be added", Arrays.toString(keys), Arrays.toString(test.keys) );
        assertEquals("key value should be added", Arrays.toString(vals), Arrays.toString(test.values) );
        assertEquals("key-value number should be updated", 1, test.keyValueNum);

    }

    @Test
    public void addWithCollision() {

        String[] keys = new String[ARRAY_SIZE * 2];
        Integer[] vals = new Integer[ARRAY_SIZE * 2];
        keys[0] = "First";
        keys[1] = "Fourth key";
        keys[2] = "Another key";
        keys[7] = "third";

        vals[0] = 2;
        vals[1] = 24;
        vals[2] = 24;
        vals[7] = 100;

        test.add("First", 2);
        test.add("Another key", 24);

        //Load factor exceeds 0.5, therefore, array size should be doubled
        test.add("third", 100);
        test.add("Fourth key", 24);

        assertEquals("key value should be added", Arrays.toString(keys), Arrays.toString(test.keys) );
        assertEquals("key value should be added", Arrays.toString(vals), Arrays.toString(test.values) );
        assertEquals("array size should be doubled", ARRAY_SIZE * 2, test.size);
        assertEquals("key-value number should be updated", 4, test.keyValueNum);

    }


    @Test (expected=IllegalArgumentException.class)
    public void addNull() {
       test.add(null, null);
    }

    /****************************************** TEST GET FUNCTION **********************************************/
    @Test
    public void getEmptyHashTable() {
        assertNull("Get should return null", test.get("Random") );
    }

    @Test
    public void getOneValue() {
        test.add("First", 2);
        assertEquals("Get should return the value",Integer.valueOf(2), test.get("First") );
    }

    @Test
    public void getWithValues() {
        test.add("First", 2);
        test.add("Another key", 24);
        test.add("third", 100);
        assertEquals("Get should return the value",Integer.valueOf(100), test.get("third") );
    }

    @Test (expected=IllegalArgumentException.class)
    public void getNull() {
        test.get(null);
    }

    /****************************************** TEST CONTAINS FUNCTION **********************************************/

    @Test
    public void containsTrue() {
        test.add("First", 2);
        assertTrue("Contains should return true",test.contains("First") );
    }

    @Test
    public void containsFalse() {
        test.add("First", 2);
        assertFalse("Contains should return false",test.contains("Nada") );
    }

    @Test (expected=IllegalArgumentException.class)
    public void containsNull() {
        test.contains(null);
    }


    /****************************************** TEST HASH FUNCTION **********************************************/
    @Test
    public void hash() {
        assertEquals("Get should return the value", 3, test.hash("third"));
    }

}