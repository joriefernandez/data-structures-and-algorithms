package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> test;

    @Before
    public void init(){
        Tree<Integer> test = new BinarySearchTree<>();
    }

    @Test
    public void testBST(){
        test = new BinarySearchTree<>();
        assertNull("BST should be empty", test.overallRoot);
    }

    @Test
    public void addEmpty() {
        test = new BinarySearchTree<>();
        test.add(1);
        assertEquals("Should add new node to the empty tree", Integer.valueOf(1), test.overallRoot.data );
        assertNull("Left child should be null", test.overallRoot.left );
        assertNull("Right child should be null", test.overallRoot.right );


    }

    @Test
    public void addToTree() {
        test = new BinarySearchTree<>();
        test.add(10);
        test.add(1);
        assertEquals("Should add new node to the empty tree", Integer.valueOf(10), test.overallRoot.data );
        assertEquals("Values should be the same", Integer.valueOf(1), test.overallRoot.left.data );
        assertNull("Right child should be null", test.overallRoot.right );

        test.add(15);
        assertEquals("Values should be the same", Integer.valueOf(15), test.overallRoot.right.data );

        test.add(13);
        assertEquals("Values should be the same", Integer.valueOf(13), test.overallRoot.right.left.data );
        assertNull("Left should be null", test.overallRoot.right.right );

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(1);
        expected.add(15);
        expected.add(13);
        assertEquals("Should return correct values", expected, test.preOrder());


    }

    @Test
    public void containsNull() {
        test = new BinarySearchTree<>();
        assertFalse("Empty tree should return false", test.contains(1));
    }

    @Test
    public void containsTrueRoot() {
        test = new BinarySearchTree<>();
        test.add(1);
        test.add(2);
        test.add(10);
        assertTrue("Tree contains the value", test.contains(1));
    }

    @Test
    public void containsTrueLeaf() {
        test = new BinarySearchTree<>();
        test.add(1);
        test.add(2);
        test.add(10);
        assertTrue("Tree contains the value", test.contains(10));
    }

    @Test
    public void containsFalseRoot() {
        test = new BinarySearchTree<>();
        test.add(1);
        test.add(2);
        test.add(10);
        assertFalse("Tree contains the value", test.contains(20));
    }

  
}