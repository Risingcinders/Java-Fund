import java.util.HashMap;
import java.util.Set;

public class HashmappinTest {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Beating the Door", "Knock knock knock knock knock");
		trackList.put("Walking Dogs", "Plop plop pick up crap.");
		trackList.put("MBop (Cover)", "MBop, mmmm mmmmmm mm mmmmBop.");
		trackList.put("Radar Days", "Wish swish boop swish whick swish boop");
		
		trackList.get("Walking Dogs");
		
		Set<String> keys = trackList.keySet();
		for (String key : keys ) {
			System.out.println(key + ": " + trackList.get(key));
		}
	}

}
