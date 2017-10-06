package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//create a variable to define our career
		
		//Declare variable
		String career;
		System.out.println("Program is starting");
		
		//Defined a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		//Declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" +salary + " Per year.");
		
		//compute annual salary
		//rate * hoursPerWeek * weeksPerYear
	}

}
