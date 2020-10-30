package Programmers;

import java.util.ArrayList;

public class IntegerToReverseString {
	public static void main(String[] args) {
		long n = 12345;
		solution(n);
	}
	
	public static ArrayList<Integer> solution(long n) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(n>0) {
			answer.add((int) (n%10));
			n = n/10;
		}
		return answer;
	}
}
