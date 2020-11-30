
public class StringManipulatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("           Hello    ", "      Wwilly  ");
		System.out.println(str);
		
		Integer a = manipulator.getIndexOrNull("Coding", 'o');
		Integer b = manipulator.getIndexOrNull("Hello World", 'o');
		Integer c = manipulator.getIndexOrNull("hi", 'o');
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer a1 = manipulator.getIndexOrNull(word, subString);
		Integer b1 = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(a1); // 2
		System.out.println(b1); // null
		
		String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(word1); // eworld


	}

}
