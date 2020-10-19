package Programmers;

public class CenterWord {
	public static void main(String[] args) {
		String s = "abcde";
		solution(s);
	}

	public static String solution(String s) {
		int sLength = s.length();

		if (sLength % 2 == 0) {
			return s.substring(sLength / 2 - 1, sLength / 2 + 1);
		} else {
			return s.substring(sLength / 2, sLength / 2 + 1);
		}
	}
}
