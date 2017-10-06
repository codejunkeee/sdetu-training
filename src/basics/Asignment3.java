//Program to find the min, max, and average of an array.

package basics;

public class Asignment3 {

	public static void main(String[] args) {
		
		int[] numbers = { 23, 5, 23, 5, 53};
		System.out.println("The minimum number is: " + (getMin(numbers)));
		System.out.println("The maximum number is: " + (getMax(numbers)));
		System.out.println("The Average number is: " + (getAvg(numbers)));
		System.out.println("The Unique number is: " + (getUnique(numbers)));
	}
	// Get the Minimum
	 public static int getMin(int[] arr) {
		 int min = arr[0];
		 for (int i = 0; i < arr.length; i++) {
			 if( arr[i] < min) {
				 min = arr[i];
			 }
			 
		 }
		 return min;
	 }
	// Get the Max 
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// Get the Average
	public static int getAvg(int[] arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}

	//Get the unique number
	public static int getUnique(int[] arr) {
		
		int result = 0;
		//for each integer a called arr....
		for( int a : arr) {
			result ^= a;
	}
	return result;
	
	
}
}
