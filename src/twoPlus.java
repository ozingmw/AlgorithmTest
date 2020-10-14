package Programmers;

import java.util.Arrays;
import java.util.TreeSet;

public class twoPlus {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		solution(numbers);
	}
	static int num = 0;
	
	public static TreeSet<Integer> solution(int[] numbers) {
		TreeSet<Integer> answer = new TreeSet<>();
		answer = addList(numbers, answer);
		return answer;
	}

	private static TreeSet<Integer> addList(int[] numbers, TreeSet<Integer> addNumberList) {	
		if(numbers.length==1)
			return null;
		addList(Arrays.copyOfRange(numbers, 1, numbers.length), addNumberList);
		for(int x=1; x<numbers.length; x++) {
			addNumberList.add(numbers[0] + numbers[x]);
		}
		
		return addNumberList;
	}
		
}
