package datastructure.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        //write your code here


        //add elements
        LinkedList<String> color=new LinkedList<String>();
        color.add("red");
        color.add("yellow");
        color.add("green");
        color.add("blue");
        color.add("black");
        color.add("white");
        System.out.println("Initial list of elements: "+color);


        //remove elements
        //Removing specific element from arraylist
        color.remove("red");
        System.out.println("After invoking remove(object) method: "+color);
        //Removing element on the basis of specific position
        color.remove(0);
        System.out.println("After invoking remove(index) method: "+color);


        /* retrieve and print out data using
        For Loop for iterating ArrayList */
        System.out.println("retrieve and print out data using For Loop");
        for (int counter = 0; counter < color.size(); counter++) {
            System.out.println(color.get(counter));
        }

        /* retrieve and print out data using
        Advanced For Loop*/
        System.out.println("retrieve and print out data using Advanced For Loop");
        for (String col : color) {
            System.out.println(col);
        }

        /* retrieve and print out data using
        While Loop for iterating ArrayList*/
        System.out.println("retrieve and print out data usingWhile Loop");
        int count = 0;
        while (color.size() > count) {
            System.out.println(color.get(count));
            count++;
        }

        /*retrieve and print out data using
        Looping Array List using Iterator*/
        System.out.println(" retrieve and print out data using Iterator");
        Iterator iter = color.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
