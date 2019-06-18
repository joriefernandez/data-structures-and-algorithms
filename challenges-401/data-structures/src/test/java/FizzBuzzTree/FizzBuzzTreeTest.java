package FizzBuzzTree;

import org.junit.Test;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTreeNull() {
        Tree<String> numbers = new Tree<>();
        FizzBuzzTree.fizzBuzzTree(numbers);
        assertNull("Should be null tree", numbers.getOverallRoot());
    }

    @Test
    public void fizzBuzzTreeOneValueFizz(){
        Tree<String> numbers = new Tree<>(new Node("3"));
        FizzBuzzTree.fizzBuzzTree(numbers);
        assertEquals("Value should be converted to FIZZ", "Fizz", numbers.getOverallRoot().getData());

    }

    @Test
    public void fizzBuzzTreeOneValueBuzz(){
        Tree<String> numbers = new Tree<>(new Node("20"));
        FizzBuzzTree.fizzBuzzTree(numbers);
        assertEquals("Value should be converted to BUZZ", "Buzz", numbers.getOverallRoot().getData());

    }

    @Test
    public void fizzBuzzTreeOneValueFizzBuzz(){
        Tree<String> numbers = new Tree<>(new Node("30"));
        FizzBuzzTree.fizzBuzzTree(numbers);
        assertEquals("Value should be converted to FIZZBUZZ", "FizzBuzz", numbers.getOverallRoot().getData());

    }

    @Test
    public void fizzBuzzTreeNonDivisible(){
        Tree<String> numbers = new Tree<>(new Node("41"));
        FizzBuzzTree.fizzBuzzTree(numbers);
        assertEquals("Value should be not converted", "41", numbers.getOverallRoot().getData());

    }

    @Test
    public void fizzBuzz() {
        Node left = new Node("1", new Node("24"), new Node("25"));
        Node right = new Node("15", new Node("60"), new Node("9"));
        Node rootNode = new Node("20", left, right);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Buzz");
        expected.add("1");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("FizzBuzz");
        expected.add("FizzBuzz");
        expected.add("Fizz");

        Tree<String> test = new Tree<String>(rootNode);
        FizzBuzzTree.fizzBuzzTree(test);
        assertEquals("Values should be correctly converted", expected, test.preOrder());
    }
}