package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of The Rings";
		
		if (bookTitle.contains("Ring")) {
			System.out.println("The book contains the word " + wordChoice);

	}
	
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tony";
		String lastName = "Badolato";
		String SSN = "223344556";
		
		if (SSN.length() > 9) {
			System.out.println("Too many numbers in your SSN");
		}
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//print initials and last 4 of social security
		System.out.print(firstName.substring(0));
		System.out.print(lastName.substring(0, 1));
		System.out.println(SSN.substring(5));
		
		
		
	}
	
		
}

