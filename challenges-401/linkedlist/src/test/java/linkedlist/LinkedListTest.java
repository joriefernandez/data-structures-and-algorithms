package linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;
import linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListTest {
    //Test empty
    @Test public void testEmptyLinkedListPrint() {
        LinkedList test = new LinkedList();
        assertEquals("Should return empty.", new ArrayList<>(),  test.print());
    }

    //Test empty
    @Test public void testEmptyLinkedList() {
        LinkedList test = new LinkedList();
        assertEquals("Should return empty.", null,  test.head);
    }

    //Test insert with 1 value
    @Test public void testOneValueLinkedList() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        LinkedList test = new LinkedList();
        test.insert(1);
        assertEquals("Should return one value.", expected,  test.print());
    }

    //Test insert with values
    @Test public void testValuesLinkedList() {
        List<Integer> expected = new ArrayList<>();
        expected.add(8);
        expected.add(3);
        expected.add(1);
        LinkedList test = new LinkedList();
        test.insert(1);
        test.insert(3);
        test.insert(8);
        assertEquals("Should return all values inserted.", expected,  test.print());
    }

    //Test current value of head
    @Test public void testHead() {

        LinkedList test = new LinkedList();
        test.insert(25);
        assertEquals("Head should be the last inserted value.", 25,  test.head.value);

        test.insert(4);
        assertEquals("Head should be the last inserted value.", 4,  test.head.value);
    }

    //Test includes if value is in the list
    @Test public void tesIncludesValid() {

        LinkedList test = new LinkedList();
        test.insert(25);
        test.insert(2);
        test.insert(4);
        assertEquals("Head should be the last inserted value.", true,  test.includes(2));
    }

    //Test includes if value is in list with 1 value
    @Test public void tesIncludesValidOneVal() {

        LinkedList test = new LinkedList();
        test.insert(25);
        assertEquals("Head should be the last inserted value.", true,  test.includes(25));
    }

    //Test includes if value is in list with 1 value
    @Test public void tesIncludesInvalidOneVal() {

        LinkedList test = new LinkedList();
        test.insert(25);
        assertEquals("Head should be the last inserted value.", false,  test.includes(1));
    }


    //Test includes if value is in the list
    @Test public void tesIncludesNotValid() {

        LinkedList test = new LinkedList();
        test.insert(25);
        test.insert(2);
        test.insert(4);
        assertEquals("Head should be the last inserted value.", false,  test.includes(100));
    }
}
