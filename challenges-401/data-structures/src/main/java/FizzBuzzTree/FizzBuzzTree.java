package FizzBuzzTree;

import tree.Node;
import tree.Tree;


public class FizzBuzzTree {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";


    public static void fizzBuzzTree(Tree<String> input){
        fizzBuzzRecursion(input.getOverallRoot());
    }

    private static void fizzBuzzRecursion(Node<String> root){
        if(root != null){
            Integer rootValue = Integer.parseInt(root.getData());
            if(isDivisibleBy3(rootValue) && isDivisibleBy5(rootValue)){
                root.setData(FIZZBUZZ);
            } else if(isDivisibleBy3(rootValue)){
                root.setData(FIZZ);
            } else if(isDivisibleBy5(rootValue)){
                root.setData(BUZZ);
            }

            fizzBuzzRecursion(root.getLeft());
            fizzBuzzRecursion(root.getRight());
        }


    }

    private static boolean isDivisibleBy3(Integer value){
       return (value % 3 == 0);
    }

    private static boolean isDivisibleBy5(Integer value){
        return (value % 5 == 0);
    }


}
