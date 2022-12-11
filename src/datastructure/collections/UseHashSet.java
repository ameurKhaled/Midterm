package datastructure.collections;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

    /*
     *
     * demonstrate how to use HashSet that includes add,remove elements
     * add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
     * use for each loop to print out data
     * print out the number of the elements of your HashSet
     *
     */

    public static void main(String[] args) {

        //write your code here

        Set<Integer> set1 = new HashSet<>();

        //add elements
        System.out.println("Add elements :\n");
        set1.add(3);
        set1.add(3);
        set1.add(4);
        set1.add(1);
        set1.add(7);
        set1.add(1);
        set1.add(0);
        set1.add(7);
        set1.add(4);
        set1.add(5);
        set1.add(0);
        set1.add(9);
        set1.add(8);

        System.out.println(set1+"\n");

        //remove elements
        System.out.println("Remove elements :\n");
        set1.remove(0);
        set1.remove(9);
        System.out.println(set1+"\n");


        //Print out data using for-each loop
        for ( Integer set1Element: set1) {
                System.out.println("The element " + set1Element + " is in the HashSet \n ");
            }


        //print out the number of the elements ofHashSet
        set1.size();
        System.out.println("The number of the elements of HashSet are: "+set1.size());

    }
}
