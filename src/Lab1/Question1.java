package Lab1;

public class Question1 {

	public static void main(String[] args) {
		
		System.out.println(sum(5));

	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

}
