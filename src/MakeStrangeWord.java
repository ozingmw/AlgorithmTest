package Programmers;

public class MakeStrangeWord {
	public static void main(String[] args) {
		String s = " try hello world ";
		solution(s);
	}

	public static String solution(String s) {
		String answer = "";
		int wordIndex = 0;
		s = s.replace(' ', '_');
		for (int x = 0; x < s.length(); x++) {
			if (s.charAt(x) == '_') {
				answer += " ";
				wordIndex = 0;
			} else {
				if (wordIndex % 2 == 0) {
					if (s.charAt(x) >= 'a' && s.charAt(x) <= 'z')
						answer += (char) (s.charAt(x) - 32);
					else
						answer += s.charAt(x);
				} else {
					if (s.charAt(x) >= 'A' && s.charAt(x) <= 'Z')
						answer += (char) (s.charAt(x) + 32);
					else
						answer += s.charAt(x);
				}
				wordIndex++;
			}
		}

		return answer;
	}
}
