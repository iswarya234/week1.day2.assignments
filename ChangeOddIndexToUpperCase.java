package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		char[] testarr = test.toCharArray();
		System.out.println("Changing odd index to uppercase:");
		for (int i = 0; i < testarr.length; i++) {
			if (i % 2 != 0) {
				char a = Character.toUpperCase(testarr[i]);
				System.out.println(a);
			}
		}

	}


	}


