import java.util.ArrayList;

public class CatchThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");

		for(int i = 0; i < myList.size(); i++) {
		    try{Integer castedValue = (Integer) myList.get(i);
		    } catch (ClassCastException e ) {
		    	System.out.println("Whatever that was isn't an integer.");
		    }
		}

	}

}
