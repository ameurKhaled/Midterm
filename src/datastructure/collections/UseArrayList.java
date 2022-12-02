package datastructure.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        //write your code here
        ArrayList<Integer> list1 = new ArrayList();

        //add elements
    System.out.println("Add elements to an ArrayList:\n");

        list1.add(4);
        list1.add(48);
        list1.add(9);
        list1.add(1);
        list1.add(99);
        list1.add(2);
        list1.add(56);
        list1.add(777);
        list1.add(1);
        System.out.println(list1+"\n");

        //remove elements
        System.out.println("Remove elements to an ArrayList:\n");
        list1.remove(0);
        list1.remove(0);
        System.out.println(list1+"\n");


        //Element to retrieve in the list
        int elementToRetrieve;
        System.out.println("Please enter element to retrieve in the list\n");
        Scanner sc = new Scanner(System.in);
        elementToRetrieve = sc.nextInt();

        // for-each loop
        System.out.println("Retrieve ant print element in an ArrayList using for-each loop :\n");
        boolean retreive = false;
        for ( Integer list1Element: list1) {
            if(elementToRetrieve == list1Element) {
                System.out.println("The element " + elementToRetrieve + " is in the list\n ");
                retreive = true;
                break;
            }

        }
        if (retreive == false) {
            System.out.println("The element " + elementToRetrieve + " is not in the list \n");
        }


        // for loop
        retreive = false;
        System.out.println("Retrieve ant print element in an ArrayList using for loop :\n");
        for(int i = 0; i < list1.size(); i++) {
            if (elementToRetrieve == list1.get(i)) {
                System.out.println("The element " + elementToRetrieve + " is in the list \n");
                retreive = true;
                break;
            }
        }
            if (retreive == false) {
                System.out.println("The element " + elementToRetrieve + " is not in the list \n");
        }

        // while loop
        retreive = false;
        System.out.println("Retrieve ant print element in an ArrayList using while loop : \n");
        int i = 0;
        while( i < list1.size()){
            if (elementToRetrieve == list1.get(i)) {
                System.out.println("The element " + elementToRetrieve + " is in the list \n");
                retreive = true;
                break;
            }
            i++;

        }
        if (retreive == false) {
            System.out.println("The element " + elementToRetrieve + " is not in the list \n");
        }

    }
}
