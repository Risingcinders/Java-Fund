import java.util.ArrayList;

public class Basics {
	
	public void printAll255() {
		for (int i = 0; i <= 255; i++) {
			System.out.println(i);
		}
	}
	
	public void printOdd255() {
		for (int i = 1; i <= 255; i += 2) {
			System.out.println(i);
		}
	}
	
	public void printSum() {
		int sum = 0;
		for (int i = 0; i <= 255; i++) {
			sum += i;
			System.out.println(String.format("New Number: %d Sum: %d", i, sum ));
		}
	}
	
	public void printArray(int[] arr1 ) {
		for (int i = 0; i < arr1.length; i++ ) {
			System.out.println(arr1[i]);
		}
	}
	
	public void arrayMax(int[] arr1 ) {
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++ ) {
			if (arr1[i] > max ) {
				max = arr1[i];
			}
		}
		System.out.println(max);
	}
	
	public void arrayAvg(int[] arr1) {
		int sum = 0;
		for (int i = 0; i< arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println(sum/arr1.length);
	}
	
	public void oddArray() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 1; i <= 255; i += 2) {
			y.add(i);
		}
	}
	
	public void arrayGreater(int[] arr1, int number) {
		int count = 0; 
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > number) { 
				count++;
			}
		}
		System.out.println(count);
	}
	
	public int[] arrayPositizer(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0) {
				arr1[i] = 0;
			}
		}
		return arr1;
	}
	
	public int[] minMax(int[] arr1) {
		int sum = 0;
		int max = arr1[0];
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
			if (arr1[i] < min) {
				min = arr1[i];
			}
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		int avg = sum/arr1.length;
		return new int[] {max, min, avg};
	}
	
	public void shiftArray(int[] arr1) {
		for (int i = 0; i < arr1.length-1; i++) {
			arr1[i] = arr1[i+1];
		}
		arr1[arr1.length-1] = 0;
	}

}
