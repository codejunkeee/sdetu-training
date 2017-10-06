package basics;

public class Weather {

	public static void main(String[] args) {
		//This program gives suggestions of what to wear based on temperature
		
		int temperature = 85;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and a t-shirt");
		}
		else if (temperature > 60 && sunCondition == "Sunny") {
		System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans.");
		System.out.println("Wear some sunglasses.");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, wear some warmer clothes.");
		}
		else {
			System.out.println("It's a cold day. Bring a sweater.");
		}
		
		System.out.println("The program is ending.");

	}
	
}
