package problems.math;

import java.util.Arrays;

public class FindLowestDifference {
    /*
     *
     * consider these below two arrays (array1 and array2)
     * find the lowest difference between the two arrays cells
     * hint: the lowest difference between cells is 1
     *
	 */

       // int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        //int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

		// function to calculate Small
		// result between two arrays
		static int findSmallestDifference(int array1[], int array2[],
		int m, int n)
		{
			// Sort both arrays
			// using sort function
			Arrays.sort(array1);
			Arrays.sort(array2);

			int a = 0, b = 0;

			// Initialize result as max value
			int result = Integer.MAX_VALUE;

			// Scan Both Arrays upto
			// sizeof of the Arrays
			while (a < m && b < n)
			{
				if (Math.abs(array1[a] - array2[b]) < result)
					result = Math.abs(array1[a] - array2[b]);

				// Move Smaller Value
				if (array1[a] < array2[b])
					a++;

				else
					b++;
			}

			// return final sma result
			return result;
		}

		// Driver Code
		public static void main(String[] args)
		{
			// Input given array1
			int array1[] = {30, 12, 5, 9, 2, 20, 33, 1};

			// Input given array2
			int array2[] = {18, 25, 41, 47, 17, 36, 14, 19};


			// Calculate size of Both arrays
			int m = array1.length;
			int n = array2.length;

			String str1 = Arrays.toString(array1);
			String str2 = Arrays.toString(array2);
			// Call function to
			// print smallest result
			System.out.println("Consider these below two arrays (array1 and array2):");
            System.out.println("  array 1 = " +str1);
			System.out.println("  array 2 = " +str2);
			System.out.println("The lowest difference between the two arrays cells is " +findSmallestDifference
					(array1, array2, m, n));

		}
	}



