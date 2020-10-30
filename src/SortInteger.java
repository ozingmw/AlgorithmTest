package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortInteger {
	public static void main(String[] args) {
		long n = 118372;
		solution(n);
	}
	
	public static long solution(long n) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(n>0) {
			answer.add((int) (n%10));
			n = n/10;
		}
		
		Collections.sort(answer, Comparator.reverseOrder());
		String tmp = "";
		for(Integer temp : answer) {
			tmp += temp;
		}
		return Long.parseLong(tmp);
	}
}
