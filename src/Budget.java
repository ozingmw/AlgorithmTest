package Programmers;

import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		solution(d, budget);
	}
	
	public static int solution(int[] d, int budget) {
		Arrays.sort(d);
		int answer = 0;
		
		for(int x=0; x<d.length; x++) {
			if(budget<=0)
				break;
			budget -= d[x];
			if(budget>=0)
				answer++;
		}
		
		return answer;
	}
}
