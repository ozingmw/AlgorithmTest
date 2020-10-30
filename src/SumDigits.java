package Programmers;

public class SumDigits {
	public static void main(String[] args) {
		int n = 123;
		solution(n);
	}
	
	public static int solution(int n) {
		int answer = 0;
		while(n>0) {
			answer += n%10;
			n = n/10;
		}
		return answer;
	}
}
