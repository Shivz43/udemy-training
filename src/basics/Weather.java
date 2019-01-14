package basics;

public class Weather {
	public static void main(String[]args) {
		//This program will give suggestions on what to wear based on weather(temperature and sun condition)
		
		int temperature = 20;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's hot, wear shorts and a T-Shirt.");
		}
		else if((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a bit cooler, wear a long sleeve shirt and jeans.");
			System.out.println("Wear sunglasses to protect your eyes from the sun.");
		}
		else if((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("Looks like a cooler day, wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day, wear a jacket.");
		}
		System.out.println("The program is ending");
	}

}
