package FizzBuzzTree;

import tree.Node;
import tree.Tree;


public class FizzBuzzTree {

    //For numbers divisible by 3
    private static final String FIZZ = "Fizz";
    //For numbers divisible by 5
    private static final String BUZZ = "Buzz";
    //For numbers divisible by 3 and 5
    private static final String FIZZBUZZ = "FizzBuzz";


    /**
     * Method to convert values based from divisibility of 3 and 5.
     * @param input tree values to be converted
     */
    public static void fizzBuzzTree(Tree<String> input){
        fizzBuzzRecursion(input.getOverallRoot());
    }

    //Helper method for fizzbuzz conversion
    private static void fizzBuzzRecursion(Node<String> root){
        //Check if node is not null; If root is null do nothing
        if(root != null){
            // get root value and convert to Integer
            Integer rootValue = Integer.parseInt(root.getData());
            //Check if divisible by 3 and/or 5, if true set to corresponding FizzBuzz
            if(isDivisibleBy3(rootValue) && isDivisibleBy5(rootValue)){
                root.setData(FIZZBUZZ);
            } else if(isDivisibleBy3(rootValue)){
                root.setData(FIZZ);
            } else if(isDivisibleBy5(rootValue)){
                root.setData(BUZZ);
            }

            // Check left subtree
            fizzBuzzRecursion(root.getLeft());
            //Check right subtree
            fizzBuzzRecursion(root.getRight());
        }


    }

    // Helper method to check if value divisible by 3
    private static boolean isDivisibleBy3(Integer value){
       return (value % 3 == 0);
    }

    // Helper method to check if value divisible by 5
    private static boolean isDivisibleBy5(Integer value){
        return (value % 5 == 0);
    }


}
