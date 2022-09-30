package stringground;

public class ConvertLowerToUpperAndViceVersa {

	public static void main(String[] args) {
		System.out.println(convertLowerToUpperAndUpperToLower("AXEzz"));
		System.out.println(convertLowerToUpperAndUpperToLowerUsingCharacterClass("AXEzz"));
	}

	public static String convertLowerToUpperAndUpperToLower(String str) {
		char[] chars = str.toCharArray();
		int temp = 0;
		char[] tempArray = new char[str.length()];		
		char tempChar = 0;
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] >= 'A' && chars[i] <='Z') {
				temp = (int) chars[i];
				temp = temp + 32;
				tempChar = (char) temp;	
				tempArray[i] = tempChar;
			} else {
				temp = (int) chars[i];
				temp = temp - 32;
				tempChar = (char) temp;	
				tempArray[i] = tempChar;
			}
		}
		return new String(tempArray);
	}
	
	public static String convertLowerToUpperAndUpperToLowerUsingCharacterClass(String str) {
		char[] tempArray = new char[str.length()];		
		char tempChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))	) {
				tempChar = Character.toUpperCase(str.charAt(i));
				tempArray[i] = tempChar;
			} else {
				tempChar = Character.toLowerCase(str.charAt(i));
				tempArray[i] = tempChar;
			}
		}
		return new String(tempArray);
	}

}