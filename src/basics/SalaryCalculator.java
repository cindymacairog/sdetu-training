package basics;

public class SalaryCalculator {

	public static void main (String[] args) {
		//Declare
		String career;
		System.out.println("Program is starting");
		
		//Define
		career = "Software Engineer";
		System.out.println("My career is " + career);
		
		//Decalre and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Mobile developer";
				
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate +
				" per hour is $" + salary + " per year");
	}
}
