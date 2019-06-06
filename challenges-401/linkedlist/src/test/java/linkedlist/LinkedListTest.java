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

    //Test append if list is empty
    @Test public void testAppendEmpty() {
        List<Integer> expected = new ArrayList<>();
        expected.add(23);
        LinkedList test = new LinkedList();
        test.append(23);
        assertEquals("Should be appended at the end.", expected ,  test.print());
    }

    //Test append if list is not empty
    @Test public void testAppendValues() {
        List<Integer> expected = new ArrayList<>();
        expected.add(23);
        expected.add(2);

        LinkedList test = new LinkedList();
        test.append(23);
        test.append(2);
        assertEquals("Should be appended at the end.", expected ,  test.print());

        //add another value
        expected.add(2000);
        test.append(2000);
        assertEquals("Should be appended at the end.", expected ,  test.print());

    }

    //Test insertBefore if list has one value
    @Test
    public void testInsertBeforeOneValue() {
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(23);

        LinkedList test = new LinkedList();
        test.append(23);
        test.insertBefore(23, 10);

        assertEquals("Should be inserted at the beginning.", expected ,  test.print());

    }

    //Test insertBefore if list has one value and searched value not found
    @Test (expected=IllegalArgumentException.class)
    public void testInsertBeforeOneValueNotFound() {
        LinkedList test = new LinkedList();
        test.insertBefore(23, 10);

    }

    //Test insertBefore if list has one value
    @Test
    public void testInsertBeforeValues() {
        List<Integer> expected = new ArrayList<>();
        expected.add(235);
        expected.add(23);
        expected.add(10);



        LinkedList test = new LinkedList();
        test.insert(10);
        test.insertBefore(10, 23);
        test.insertBefore(23, 235);
        assertEquals("Should be inserted at the beginning.", expected ,  test.print());

    }

    //Test insertBefore on tail value
    @Test
    public void testInsertBeforeTailValues() {
        List<Integer> expected = new ArrayList<>();
        expected.add(235);
        expected.add(23);
        expected.add(111);
        expected.add(10);



        LinkedList test = new LinkedList();
        test.insert(10);
        test.insertBefore(10, 23);
        test.insertBefore(23, 235);
        test.insertBefore(10, 111);

        assertEquals("Should be inserted before tail.", expected ,  test.print());

    }

    //Test insertBefore on tail value
    @Test
    public void testInsertBeforeMidValues() {
        List<Integer> expected = new ArrayList<>();
        expected.add(235);
        expected.add(23);
        expected.add(25);
        expected.add(111);
        expected.add(10);

        LinkedList test = new LinkedList();
        test.insert(10);
        test.insertBefore(10, 23);
        test.insertBefore(23, 235);
        test.insertBefore(10, 111);
        test.insertBefore(111, 25);
        assertEquals("Should be inserted at the beginning.", expected ,  test.print());

    }

    //Test insertBefore if list has one value and searched value not found
    @Test (expected=IllegalArgumentException.class)
    public void testInsertAfterOneValueNotFound() {
        LinkedList test = new LinkedList();
        test.insertAfter(23, 10);

    }

    //Test insertAfter if searched value is the head value
    @Test
    public void testInsertAfterHead(){
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);

        LinkedList test = new LinkedList();
        test.append(1);
        test.insertAfter(1, 3);
        assertEquals("Inserted value should be the head", expected , test.print());
    }

    //Test insertAfter if searched value is the tail value
    @Test
    public void testInsertAfterTail(){
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(20);

        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(5);
        test.insertAfter(5, 20);
        assertEquals("Inserted value should be the head", expected , test.print());
    }

    //Test insertAfter if searched value is the tail value
    @Test
    public void testInsertAfterMid(){
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(14);
        expected.add(20);
        expected.add(11);

        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(5);
        test.append(20);
        test.append(11);
        test.insertAfter(5, 14);
        assertEquals("Inserted value should be the head", expected , test.print());
    }

    // Test kth Node
    @Test
    public void testKthValue(){
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(5);
        test.append(20);
        test.append(11);

        assertEquals("Should return the kth value.", 5, test.getKthValue(2));
    }

    // Test kthValue if looking for first Node
    @Test
    public void testKthValueFirst(){
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(5);
        test.append(20);
        test.append(11);

        assertEquals("Should return the kth value.", 1, test.getKthValue(4));
    }

    // Test kthValue if looking for last Node
    @Test
    public void testKthValueLast(){
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(5);
        test.append(20);
        test.append(11);

        assertEquals("Should return the kth value.", 11, test.getKthValue(0));
    }

    // Test kthValue if looking for the only node
    @Test
    public void testKthValueOne(){
        LinkedList test = new LinkedList();
        test.append(23);
        assertEquals("Should return the kth value.", 23, test.getKthValue(0));
    }


    // Test kthValue if looking for last Node
    @Test (expected = IllegalArgumentException.class)
    public void testKthValueInvalidNegative(){
        LinkedList test = new LinkedList();
        test.getKthValue(9);
    }

    // Test kthValue if looking for last Node
    @Test (expected = IllegalArgumentException.class)
    public void testKthValueEmpty(){
        LinkedList test = new LinkedList();
        test.getKthValue(1);
    }

    // Test kthValue if looking for last Node
    @Test (expected = IllegalArgumentException.class)
    public void testKthValueSameSizeK(){
        LinkedList test = new LinkedList();
        test.append(23);
        test.getKthValue(1);
    }


    // Test kthValue if looking for last Node
    @Test (expected = IllegalArgumentException.class)
    public void testKthValueSame(){
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(5);
        test.append(20);
        test.append(11);

        test.getKthValue(5);
    }

    // Test merge list
    @Test
    public void testMergeList(){
        LinkedList list1 = new LinkedList();
        list1.append(1);
        LinkedList list2 = new LinkedList();
        list2.append(20);

        LinkedList test = new LinkedList();
        test.mergeLists(list1, list2);

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(20);
        assertEquals("Lists should be merged.", result, test.print() );
    }

    // Test merge list
    @Test
    public void testMergeListWithValues(){
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(2);
        LinkedList list2 = new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);

        LinkedList test = new LinkedList();
        test.mergeLists(list1, list2);

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(5);
        result.add(3);
        result.add(9);
        result.add(2);
        result.add(4);

        assertEquals("Lists should be merged.", result, test.print() );
    }

    // Test merge list
    @Test
    public void testMergeListWithVariedSize(){
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);

        LinkedList list2 = new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);

        LinkedList test = new LinkedList();
        test.mergeLists(list1, list2);

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(5);
        result.add(3);
        result.add(9);
        result.add(4);

        assertEquals("Lists should be merged.", result, test.print() );
    }

    // Test merge list with varied size
    @Test
    public void testMergeListWithVariedSize2(){
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(5);

        LinkedList list2 = new LinkedList();

        list2.append(9);
        list2.append(4);

        LinkedList test = new LinkedList();
        test.mergeLists(list1, list2);

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(9);
        result.add(3);
        result.add(4);
        result.add(5);

        assertEquals("Lists should be merged.", result, test.print() );
    }

    // Test merge list with null first list
    @Test
    public void testMergeListWithList1Null(){
        LinkedList list1 = new LinkedList();

        LinkedList list2 = new LinkedList();
        list2.append(9);
        list2.append(4);

        LinkedList test = new LinkedList();
        test.mergeLists(list1, list2);

        List<Integer> result = new ArrayList<>();
        result.add(9);
        result.add(4);


        assertEquals("Lists should be merged.", result, test.print() );
    }

    // Test merge list with 2nd list null
    @Test
    public void testMergeListWithNullList(){
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(5);

        LinkedList list2 = new LinkedList();

        LinkedList test = new LinkedList();
        test.mergeLists(list1, list2);

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(5);

        assertEquals("Lists should be merged.", result, test.print() );
    }

    //Test invalid input
    @Test (expected = IllegalArgumentException.class)
    public void testMergeListsInvalid() {
        LinkedList test = new LinkedList();
        test.mergeLists(null, null);
    }
}
