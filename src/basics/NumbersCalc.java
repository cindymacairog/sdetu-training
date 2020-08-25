package basics;

public class NumbersCalc {
// Return Types and Arguments
	
	public static void main (String[]args) {
		System.out.println("Program is starting");
		printName();
		int a = 10;
		int b = 10;
		addNumbers(a,b);
		System.out.println("The product of " + a + " and " + b + " is " + multiplyNumbers(a,b));
	}
	
	static void printName() {
		System.out.println("My name is Mahone");
	}
	
	static void addNumbers(int numA,int numB) {
		int sum = numA + numB;
		System.out.println("The sum of " + numA + " and " + numB + " is " + sum );
	}
	static int multiplyNumbers(int valA, int valB) {
		int product = valA * valB;
		addNumbers(product + 10, product);
		return product;
	}
}
