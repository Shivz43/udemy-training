package myApps;

public class SumFunctionApp {

	public static void main(String[] args) {
		//Calculate sum of numbers from 1 to n using For Loop
		System.out.println(sumOf(4));
	}
	
	public static int sumOf(int n) {
		
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
