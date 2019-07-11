package treeintersection;

import org.junit.Before;
import org.junit.Test;
import treeintersection.TreeIntersection.Tree;
import treeintersection.TreeIntersection.Tree.Node;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    private Tree first;
    private Tree second;
    private TreeIntersection test;

    @Before
    public void init(){

        TreeIntersection test = new TreeIntersection();
        first = new Tree();
        second = new Tree();
    }

    @Test
    public void treeIntersectionNull() {
        test = new TreeIntersection();
        HashSet<Integer> result = new HashSet<>();
        assertEquals("Result should be the same", result,
                test.treeIntersection(first, second));

    }

    @Test
    public void treeIntersectionFirstNull() {
        test = new TreeIntersection();
        first = new Tree();
        second = new Tree(new Node(4));
        HashSet<Integer> result = new HashSet<>();
        assertEquals("Result should be the same", result.toString(),
                test.treeIntersection(first, second).toString());

    }

    @Test
    public void treeIntersectionSecondNull() {
        test = new TreeIntersection();
        first = new Tree(new Node(1));
        HashSet<Integer> result = new HashSet<>();
        assertEquals("Result should be the same", result.toString(),
                test.treeIntersection(first, second).toString());

    }

    @Test
    public void treeIntersectionSame() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node rootNode = new Node(2, left, right);

        Node anotherLeft = new Node(1, new Node(6), new Node(7));
        Node anotherRight = new Node(3, new Node(8), new Node(9));
        Node anotherRoot = new Node(2, left, right);

        first = new Tree(rootNode);
        second = new Tree(anotherRoot);
        test = new TreeIntersection();

        HashSet<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);

        assertEquals("Result should be the same", expected,
                test.treeIntersection(first, second));

    }

    @Test
    public void treeIntersectionSomeValues() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node rootNode = new Node(2, left, right);

        Node anotherLeft = new Node(9, new Node(16), new Node(7));
        Node anotherRight = new Node(32, new Node(81), new Node(9));
        Node anotherRoot = new Node(2, anotherLeft, anotherRight);

        first = new Tree(rootNode);
        second = new Tree(anotherRoot);
        test = new TreeIntersection();

        HashSet<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(7);
        expected.add(9);

        assertEquals("Result should be the same", expected,
                test.treeIntersection(first, second));

    }

    @Test
    public void treeIntersectionUniqueValues() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node rootNode = new Node(2, left, right);

        Node anotherLeft = new Node(91, new Node(16), new Node(56));
        Node anotherRight = new Node(32, new Node(81), new Node(19));
        Node anotherRoot = new Node(20, anotherLeft, anotherRight);

        first = new Tree(rootNode);
        second = new Tree(anotherRoot);
        test = new TreeIntersection();

        HashSet<Integer> expected = new HashSet<>();

        assertEquals("Result should be the same", expected,
                test.treeIntersection(first, second));

    }
}