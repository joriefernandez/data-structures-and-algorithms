package multibracketvalidation;

import java.util.HashMap;
import java.util.Stack;

public class MultiBracketValidation {
    //bracket pairings
    private static HashMap<Character, Character> brackets = new HashMap<>();

    // Method to validate brackets
    public static boolean multiBracketValidation(String input){
        // check if valid input
        if(input == null){
            throw new IllegalArgumentException("Invalid input");
        }

        //initialize pairings
        initializeBrackets();
        //stack
        Stack<Character> curBrackets = new Stack<>();
        //split string
        char[] splitWord = input.toCharArray();

        //iterate and check characters
        for(int index = 0; index < splitWord.length; index++){
            // if character is closing bracket
            if(brackets.containsKey(splitWord[index])){
                //check if not a corresponding character
                if(curBrackets.empty() ||curBrackets.peek() != brackets.get(splitWord[index])){
                    return false;
                }
                //if it is the pair, remove from stack
                curBrackets.pop();
                //if open bracket, add to the stack
            } else if(brackets.containsValue(splitWord[index])){
                curBrackets.push(splitWord[index]);
            }
        }

        //check if stack is empty or not
        if(curBrackets.empty()){
            return true;
        }

        return false;
    }

    // Helper method to add bracket pairings
    private static void initializeBrackets(){
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
    }


}
