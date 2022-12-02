package problems.math;

import java.util.Scanner;

public class MakePyramid {

    /*

    Implement a large Pyramid of stars in the screen with java.

          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *

     */

    public static void main(String[] args) {

        //write your code here
        int row, i, space, j;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number of Rows (Line): ");
        row = s.nextInt();

        for(i=0; i<row; i++)
        {
            for(space=i; space<row; space++)
                System.out.print(" ");
            for(j=0; j<(i+1); j++)
                System.out.print("* ");
            System.out.print("\n");
        }

    }
}
