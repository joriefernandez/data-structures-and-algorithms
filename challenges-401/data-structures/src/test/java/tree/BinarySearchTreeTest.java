package tree;

import org.junit.Before;
import org.junit.Test;

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
        ArrayList<Integer> result =

    }

    @Test
    public void contains() {
    }
}