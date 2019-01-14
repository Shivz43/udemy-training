package myApps;

public class FactorialsApp {

	public static void main(String[] args) {
		//Program to calculate factorials
		//1! = 1 * 1
		//2! = 2 * 1
		//3! = 3 * 2 * 1
		//4! = 4 * 3 * 2 * 1
		
        System.out.println(fact(5));
	}
	
	public static int fact(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return (n * fact(n-1));
		}
	}

}
