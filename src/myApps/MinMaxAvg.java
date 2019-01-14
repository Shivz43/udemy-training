package myApps;

public class MinMaxAvg {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 6295;
		array[1] = 795;
		array[2] = 1126;
		array[3] = 746;
		array[4] = 883;

		System.out.println(min(array));
		System.out.println(max(array));
		System.out.println(avg(array));
	}
	
	public static int min(int array[]) {
		int arrayMin = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < arrayMin) {
				arrayMin = array[i];
			}
		}
		
		return arrayMin;
	}
	
	public static int max(int array[]) {
		int arrayMax = array[0];
		for(int j = 0; j < array.length; j++) {
			if(array[j] > arrayMax) {
				arrayMax = array[j];
			}
		}
		
		return arrayMax;
	}
	
	public static int avg(int array[]) {
		int arrayAvg;
		int arraySum = 0;
		for(int k = 0; k < array.length; k++) {
			arraySum = arraySum + array[k];
		}
		
		arrayAvg = arraySum/array.length;
		return arrayAvg;
	}

}
