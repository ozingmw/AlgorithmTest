package Programmers;

public class CountryNum124 {
	public static void main(String[] args) {
		int n = 3;
		solution(n);
	}
	
	public static String solution(int n) {
		String answer = "";
		
		while(n>0) {
			if(n%3==0) {
				n = n/3 - 1;
				answer = "4" + answer;
			}else {
				answer = Integer.toString(n%3) + answer;
				n /= 3;
			}
		}
		
		return answer;
	}
}
