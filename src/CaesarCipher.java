package Programmers;

public class CaesarCipher {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		solution(s,n);
	}
	
	public static String solution(String s, int n) {
		String answer = "";
		for(int x=0; x<s.length(); x++) {
			if(s.charAt(x)!=' ') {
				if((s.charAt(x)>=91-n && s.charAt(x)<=90) || (s.charAt(x)>=123-n && s.charAt(x)<=122))
					answer += Character.toString((char) (s.charAt(x)+n-26));
				else
					answer += Character.toString((char) (s.charAt(x)+n));
			}else {
				answer += " ";
			}
		}
		return answer;
	}
}
