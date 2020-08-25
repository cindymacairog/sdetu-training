package basics;

public class Weather {

	public static void main (String[] args) {
		//What to wear based on weather
		
		int temperature = 65;
		String sunCondition = "Sunny";
		
		if((temperature > 80) || (sunCondition == "Sunny")) {
			System.out.println("It's pleasant. Wear shorts and shirts");
		}
		else if((temperature > 60) && (sunCondition == "Overcast") ) {
			System.out.println("It's a lil cooler, wear a long sleeves and jeans");
		}
		else {
			System.out.println("Looks like a cold day. Bring sweater.");
		}
		
	}
}
