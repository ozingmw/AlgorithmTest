package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Mod0Array {
	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		solution(arr, divisor);
	}
	
	public static ArrayList<Integer> solution(int[] arr, int divisor) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int num : arr) {
			if(num%divisor== 0) {
				answer.add(num);
			}
		}
		
		if(answer.size()!=0)
			Collections.sort(answer);
		else
			answer.add(-1);
		
		return answer;
	}
}
