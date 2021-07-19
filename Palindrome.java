package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "madam";
		String rev = "";

		String[] split = value.split(" ");
		for (int i = 0; i < split.length; i++) {
			rev = split[i];
		}
		System.out.println(rev);

		if (rev.equalsIgnoreCase(value) == true) {
			System.out.println("The given String " + value + " is PALINDROME");
		}

		else {
			System.out.println("The given String " + value + " is NOT A PALINDROME ");
		}
	}


	}


