package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk (){
		System.out.println(name + " is walking");
		
	}
	
	void eat(){
		System.out.println(email);
		
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	
	}
}


public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "Joe@somewhere.com";
		person1.phone = "555-7896";
		
		// Abstraction - be able to abstract information from an object at any time.
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		/*
		// Person-
		
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "123@456";
		String phone = "555-5555";
		
		// Action, activity, behavior
		System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "123@444";
		String phone2= "555-3333";
		
		// Action, activity, behavior
		System.out.println(name2 + " is walking");
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
	}
	
	//Enhance by adding functions to minimize code
	static void walking (String name) {
		System.out.println(name + " is walking.");
		*/
	}

}
