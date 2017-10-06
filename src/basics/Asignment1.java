// A function that takes a value n and returns the sum of numbers 1 to n

package basics;

public class Asignment1 {

	public static void main(String[] args) {
		System.out.println(sum(4));
	}
	
	public static int sum(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
		} 
}