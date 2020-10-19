package Programmers;

import java.util.ArrayList;

public class HateSameNum {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 3, 0, 1, 1 };
		solution(arr);
	}

	public static ArrayList<Integer> solution(int[] arr) {
		int nowNum = 0, checkNum = 1;
		ArrayList<Integer> answer = new ArrayList<Integer>();

		for (; checkNum < arr.length;) {
			if (arr[nowNum] == arr[checkNum]) {
				arr[checkNum] = -1;
				checkNum++;
			} else {
				nowNum = checkNum++;
			}
		}

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] >= 0) {
				answer.add(arr[x]);
			}
		}

		return answer;
	}
}
