package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The Book Title contains the word Ring");
		}
		
		String browser = "Chrome";
		//equalsIgnoreCase removes case sensitivity
		if(browser.equalsIgnoreCase("chrome")) {  
			System.out.println("The Browser is Chrome!");
		}
		
		String firstName = "Shiven";
		String lastName = "Baichan";
		String SSN = "795168435";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN");
		
		//Print initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,3));
		System.out.println(SSN.substring(5));

	}

}
