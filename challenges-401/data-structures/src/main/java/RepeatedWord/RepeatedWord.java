package RepeatedWord;

import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {

    // Method that returns the first word that occurs more than once.
    public static String getFirstFrequentWord(String input){

        //check if input is not null
        if(input != null) {

            Set<String> words = new HashSet<String>();
            //Split words while disregarding other characters
            String[] splitWords = input.toLowerCase().split("\\W+");
            //Loop through array and check if the word exists in the set, if so return the word
            // if not, add to the hashset
            for (String word : splitWords) {

                if (words.contains(word)) {
                    return word;
                } else {
                    words.add(word);
                }
            }
            //return the word if all words occur once
            return splitWords[0];
        }
        return null;
    }
}
