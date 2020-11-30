
public class StringManipulator {
	public String trimAndConcat(String strA, String strB) {
		return strA.trim() + strB.trim();
	}
	
	public Integer getIndexOrNull(String strA, char charA) {
		if (strA.indexOf(charA) == -1) {
			return null;
		} else {
			return strA.indexOf(charA);
		}
	}
	
	public Integer getIndexOrNull(String strA, String strB) {
		if (strA.indexOf(strB) == -1) {
			return null;
		} else {
			return strA.indexOf(strB);
		}
	}
	public String concatSubstring(String strA, int num1, int num2, String strB) {
		return strA.substring(num1, num2) + strB;
	}
}
