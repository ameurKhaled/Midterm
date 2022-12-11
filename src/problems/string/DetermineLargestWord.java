package problems.string;

public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {


        //write your code here

        String stringExample  = "Human brain is a biological learning machine";

        String word = "", large="";
        String[] words = new String[100];
        int length = 0;

        //Add extra space after string to get the last word in the given string
        stringExample  = stringExample + " ";

        for(int i = 0; i < stringExample.length(); i++){
            //Split the string into words
            if(stringExample.charAt(i) != ' '){
                word = word + stringExample.charAt(i);
            }
            else{
                //Add word to array words
                words[length] = word;
                //Increment length
                length++;
                //Make word an empty string
                word = "";
            }
        }
        //Initialize large with first word in the string
         large = words[0];

        //Determine largest word in the string
        for(int k = 0; k < length; k++){



            //If length of large is less than any word present in the string
            //Store value of word into large
            if(large.length() < words[k].length())
                large = words[k];
        }

        System.out.println("Largest word: " + large);

        //return length of largest word
        int lengthLarestWord = large.length();
        System.out.println("length of longest word is "+lengthLarestWord);
    }

}



