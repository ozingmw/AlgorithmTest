package Programmers;

import java.util.ArrayList;

public class flipTemary {
	public static void main(String[] args) {
		int n = 45;
		solution(n);
	}

	public static int solution(int n) {
		ArrayList<Integer> baseN = new ArrayList<Integer>();
		int answer = 0;

		while (n > 0) {
			baseN.add(n % 3);
			n /= 3;
		}

		for (int x = baseN.size(); x > 0; x--) {
			answer += baseN.get(x - 1) * Math.pow(3, baseN.size() - x);
		}

		return answer;
	}
}
