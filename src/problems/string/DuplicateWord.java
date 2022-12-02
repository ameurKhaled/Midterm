package problems.string;

import java.util.Arrays;

public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */
    public static int wordLength(String str){
        int wordsLength = 0;
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            wordsLength = wordsLength + words[i].length();

        }
        System.out.println("Words length is " +wordsLength);
        return wordsLength;
    }

    public  static double avrgLength(int wordsLength, int numWords){
        //also Find the average length of the words
        double averageLength = (double) wordsLength/ (double) numWords;
        System.out.println("Average length is " + averageLength);
        return averageLength;

    }

    public static void duplicatedWrd(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i]);
                System.out.println(count);
            }
        }
    }

    public static void main(String[] args) {
        //run your code here

        // write a java code to find the duplicate words and their number of occurrences in the string


        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";
        int count;

        //Converts the string into lowercase
        str = str.toLowerCase();

        //Split the string into words using built-in function
        String words[] = str.split(" ");

        int wordsLength = wordLength(str);

        avrgLength( wordsLength,words.length);

        System.out.println("Duplicate words in a given string : ");
        duplicatedWrd(words);


        }

    }

