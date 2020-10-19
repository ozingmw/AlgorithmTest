package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class K_Number {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		solution(array, commands);
	}

	public static ArrayList<Integer> solution(int[] array, int[][] commands) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int x=0; x<commands.length; x++) {
			int[] copyArray = Arrays.copyOfRange(array, commands[x][0]-1, commands[x][1]);
            Arrays.sort(copyArray);
			answer.add(copyArray[commands[x][2]-1]);
		}
		return answer;
	}
}
