package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class TreeTest {

    private Tree<Integer> testInt;

    @Before
    public void treeInit(){
        testInt = new Tree<Integer>();

    }

    //Test tree initialization
    @Test
    public void testTreeInit(){
        testInt = new Tree<Integer>();
        assertNull("Overall root should be null", testInt.overallRoot);

    }

    //Add a root value
    @Test
    public void testTreeWithOneNode(){
        Node rootNode = new Node(2);
        testInt = new Tree<Integer>(rootNode);
        assertEquals("Value should be the same as root data", Integer.valueOf(2), testInt.overallRoot.data);

    }

    //Add left and right children
    @Test
    public void testTreeWithChildren(){

        Node left = new Node(1);
        Node right = new Node(3);
        Node rootNode = new Node(2, left, right);
        testInt = new Tree<Integer>(rootNode);
        assertEquals("Value should be the same as root data", Integer.valueOf(2), testInt.overallRoot.data);
        assertEquals("Value should be the same as left data", Integer.valueOf(1), testInt.overallRoot.left.data);
        assertEquals("Value should be the same as right data", Integer.valueOf(3) , testInt.overallRoot.right.data);

    }


    @Test
    public void preOrder() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node rootNode = new Node(2, left, right);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(6);
        expected.add(7);
        expected.add(3);
        expected.add(8);
        expected.add(9);

        testInt = new Tree<Integer>(rootNode);
        assertEquals("Value should do pre-order", expected, testInt.preOrder());
    }

    @Test
    public void postOrder() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node rootNode = new Node(2, left, right);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(7);
        expected.add(1);
        expected.add(8);
        expected.add(9);
        expected.add(3);
        expected.add(2);

        testInt = new Tree<Integer>(rootNode);
        assertEquals("Value should do post-order", expected, testInt.postOrder());
    }

    @Test
    public void inOrder() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node rootNode = new Node(2, left, right);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(1);
        expected.add(7);
        expected.add(2);
        expected.add(8);
        expected.add(3);
        expected.add(9);

        testInt = new Tree<Integer>(rootNode);
        assertEquals("Value should do in-order", expected, testInt.inOrder());
    }


    @Test
    public void preOrderEmpty(){
        assertNull("Overall root should be null", testInt.preOrder());

    }

    @Test
    public void inOrderEmpty(){
        assertNull("Overall root should be null", testInt.inOrder());

    }


    @Test
    public void postOrderEmpty(){
        assertNull("Overall root should be null", testInt.postOrder());

    }

}