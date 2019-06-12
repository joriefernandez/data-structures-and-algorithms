package multibracketvalidation;

import java.util.HashMap;
import java.util.Stack;

public class MultiBracketValidation {
    //bracket pairings
    private static HashMap<Character, Character> brackets = new HashMap<>();

    public static boolean multiBracketValidation(String input){
        initializeBrackets();
        Stack<Character> curBrackets = new Stack<>();

        char[] splitWord = input.toCharArray();

        for(int index = 0; index < splitWord.length; index++){
            if(brackets.containsKey(splitWord[index])){
                if(curBrackets.peek() != brackets.get(splitWord[index])){
                    return false;
                }
                curBrackets.pop();
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
