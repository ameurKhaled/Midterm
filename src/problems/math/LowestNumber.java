package problems.math;

public class LowestNumber {
    /*
     *
     * write java code to find the lowest number from the given array
     *
     */

    public static void main(String[] args) {

        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        //Initialize min with first element of array.
        int min = array[0];
        //Loop through the array
        for (int i = 0; i < array.length; i++) {
            //Compare elements of array with min
            if(array[i] <min)
                min = array[i];
        }
        // Print lowest number from the given array
        System.out.println("Smallest number present in given array: " + min);



    }
}
