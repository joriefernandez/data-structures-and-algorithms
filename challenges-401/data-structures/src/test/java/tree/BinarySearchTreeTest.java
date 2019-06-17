package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> test;

    @Before
    public void init(){
        BinarySearchTree<Integer> test = new BinarySearchTree<>();
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

        test.add(4);
        assertEquals("Should be inserted correctly", new ArrayList<Integer>(), test.postOrder());
    }

    @Test
    public void contains() {
    }
}