package problems.math;

import java.util.Scanner;

public class Factorial {

    /*
     *
     * factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * write a java program to find Factorial of a given number
     * you can use Recursion or Iteration
     *
     */

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {

        //run your code here
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);


    }

}
