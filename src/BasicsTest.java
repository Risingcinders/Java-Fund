import java.util.Arrays;

public class BasicsTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basics BJ = new Basics();
		BJ.printAll255();
		BJ.printOdd255();
		BJ.printSum();
		int[] arrA =  {1,2,3,-5,0,4};
		BJ.printArray(arrA);
		BJ.arrayMax(arrA);
		BJ.arrayAvg(arrA);
		BJ.oddArray();
		BJ.arrayGreater(arrA, 2);
		System.out.println(Arrays.toString(BJ.arrayPositizer(arrA)));
		BJ.shiftArray(arrA);
		System.out.println(Arrays.toString(BJ.arrayPositizer(arrA)));
	}
}
