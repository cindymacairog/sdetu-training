package basics;

public class Cities {

	public static void main(String[] args) {
		
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
	

	//Declare array
	String[] countries;
	
	//Define array
	countries = new String[3];
	countries[0] = "Switzerland";
	countries[1] = "USA";
	countries[1] = "Spain";
	System.out.println(countries[0]);
	
	System.out.println("-----------------------");
	
	//Declare the array and define
	String[] states = new String[6];
	states[0] = "California";
	states[1] = "Ohio";
	states[2] = "Utah";
	states[3] = "New Jersey";
	states[4] = "Texas";
	int i = 0;
	//Do: enters loop then test condition
	do {
		System.out.println("STATES: " + states[i]);
		i = i + 1;
	} while (i <= 4);
	//while: test condition first then enters the loop
	
	
	
	int n = 0;
	boolean statefound = false;
	while(!statefound) {
		String state = states[n];
		System.out.println(state);
		if(state == "Texas") {
			System.out.println("STATE FOUND");
			statefound = true;
		}
		n++;
	}
	
	//For: best structure for iterating through an array
	System.out.println("\nPrinting with for loop");
	for (int x = 0; x<5; x++) {
		System.out.println(states[x]);
	}
	
	}
	
}
