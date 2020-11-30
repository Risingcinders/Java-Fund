
public class FizzBuzz {


	public String fizzBuzz(int number) {
		String output = "";
		if (number % 3 == 0) {
			output = "Fizz";
		}
		if (number % 5 == 0) {
			output += "Buzz";
		}
		if (output.length() == 0 ) {
			String numberObj = new Integer(number).toString();
			return numberObj;
		} else {
			return output;
		}

	}


}
