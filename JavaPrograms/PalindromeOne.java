import java.util.*;
import java.io.*;

public class PalindromeOne {

	public static void main(String[] args) {
//		TODO Auto-generated method stub
		int counter = 11;
		int palindromesFound = 0;
		while (palindromesFound < 10) {
			if (isPalindrome(Integer.toString(counter))) {
				System.out.print(counter);
				palindromesFound++;
				if (palindromesFound % 10 != 0) {
					System.out.print(",");
				} else {
					System.out.print("");
				}
			}
			counter++;
		}
	}

	public static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++)
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		return true;

	}

}