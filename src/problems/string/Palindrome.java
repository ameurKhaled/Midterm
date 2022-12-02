package problems.string;

import java.util.Scanner;

public class Palindrome {

    /*
     *
     * write java code to check if a given String is Palindrome
     * when a String is reversed and remains unchanged, that is called Palindrome
     * example, MOM,DAD,MADAM,KAYAK
     *
     */

        public static void main(String args[])
        {
            //write your code here

            String original, reverse = ""; // Objects of String class
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string/number to check if it is a palindrome");
            original = in.nextLine();
            int length = original.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse))
                System.out.println("Entered string/number is a palindrome.");
            else
                System.out.println("Entered string/number isn't a palindrome.");
        }
}

