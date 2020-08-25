package basics;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println(sum(4));
		
		//Write function that computes the factorial
		System.out.println("Factorial: " + fact(5));
		
		//Write a function that returns the min, avg, and max of an array
		int[] numbers = {8, -5, 0, 356, -420, 75};
		System.out.println("Minimum: "+ findMin(numbers));
		System.out.println("Maximum: " + findMax(numbers));
		System.out.println("Average: " + findAvg(numbers));
	}
	
	public static int findAvg(int[] arr) {
		int sum = 0;
		for(int n=0; n<arr.length; n++) {
			sum = sum + arr[n];
		}
		System.out.println("Sum: " + sum);
		return sum/arr.length;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i );
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		System.out.println(n);
		return fact(n-1) * n;
	}
	
}
