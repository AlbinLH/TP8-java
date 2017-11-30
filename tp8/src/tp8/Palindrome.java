package tp8;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String phrase) {
		String reverse = "";
		StringBuilder phrase1 = new StringBuilder();
		phrase1.append(phrase);
		phrase1 = phrase1.reverse();
		for (int i = 0; i < phrase1.length(); i++) {
			reverse += phrase1.charAt(i);
		}
		if (reverse.equals(phrase)) {
			return (true);
		} else {
			return (false);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		phrase = phrase.replaceAll("\\W", "");
		phrase.trim();
		if (isPalindrome(phrase) == true) {
			System.out.println("C'est un palindrome");
		} else {
			System.out.println("Ce n'est pas un palindrome");
		}
		scan.close();
	}
}
