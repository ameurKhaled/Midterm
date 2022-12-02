package datastructure.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */

   // public static void main(String[] args) {



        //write your code here
        static void getUnion(int array1[], int n, int array2[], int m)
        {

            // Defining set container s
            HashSet<Integer> s = new HashSet<>();

            // Inserting array elements in s
            for (int i = 0; i < n; i++)
                s.add(array1[i]);

            for (int i = 0; i < m; i++)
                s.add(array2[i]);
            System.out.print(
                    "Number of elements after union operation: "
                            + s.size() + "\n");
            System.out.print("The union set of both arrays is :"
                    + "\n");

            System.out.print(
                    s.toString()
                            + " "); // s will contain only distinct
            // elements from array a and b
        }

        // Driver Code
        public static void main(String[] args)
        {
            int array1[]  = {1, 3, 2, 4, 8, 9, 0};
            int array2[]  = {1, 3, 7, 5, 4, 0, 7, 5};

            getUnion(array1, 7, array2, 8);
        }
    }




