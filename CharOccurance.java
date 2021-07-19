package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Chennai";
		int count = 0;
		System.out.println("The String: " + str);

		char[] strChar = str.toCharArray();

		for (int i = 0; i < strChar.length; i++) {

			if (strChar[i] == 'e') {
				count = count + 1;
			}
		}
		System.out.println("The character 'e' Occurance in the given string is : " + count);
	}


	}


