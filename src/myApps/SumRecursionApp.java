package myApps;

public class SumRecursionApp {

	public static void main(String[] args) {
		//Calculate sum of numbers from 1 to n using recursion
        System.out.println(sumOf(4));
	}
	
	public static int sumOf(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return (n + sumOf(n-1));
		}
	}

}
