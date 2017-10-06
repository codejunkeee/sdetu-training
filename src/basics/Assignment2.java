//Function that computes factorial value

package basics;

public class Assignment2 {

	public static void main(String[] args) {

	System.out.println("The Factorial is: " + factorial(5));
	}

	public static int factorial(int i) {
		if(i == 0) {
			return 1;
		}
		return factorial (i-1)*i;
	}
	
}
