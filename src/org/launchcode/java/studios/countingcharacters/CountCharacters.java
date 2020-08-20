package org.launchcode.java.studios.countingcharacters;
import java.util.*;
import java.lang.*;

public class CountCharacters {
    public static void main(String[] args){
        String theString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        countChars(theString);
    }

    public static void countChars(String aString) {

        HashMap<Character, Integer> results = new HashMap<>();

        //take in aString and convert it into char array
        aString = aString.toLowerCase();
        char[] charArray = aString.toCharArray();

        //Iterate over charArray
        for(int i=0; i < charArray.length-1;i++) {

            //Check if charArray[i] is already in results HashMap
            if(results.containsKey(charArray[i])) {
                //If it is increase count
                results.put(charArray[i], results.get(charArray[i]) + 1);
            }else {
                //else add new key:value pair
                results.put(charArray[i],1);
            }
        }
        //Iterate over results and print out each key:value pair
        for (Map.Entry<Character, Integer> character: results.entrySet()){
            System.out.println(character.getKey()+ ": "+ character.getValue());
        }
    }
}
