package Programmers;

import java.util.HashMap;

public class PEClothes {
	public static void main(String[] args) {
		int n = 8;
		int[] lost = { 2, 3, 8 };
		int[] reserve = { 1, 3, 5 };
		solution(n, lost, reserve);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(n);
		int answer = 0;

		for (int x = 1; x <= n; x++) {
			hashMap.put(x, 1);
		}
		for (int num : lost) {
			hashMap.put(num, 0);
		}
		for (int num : reserve) {
			if (hashMap.get(num) == 0) {
				hashMap.put(num, 1);
				continue;
			}
			hashMap.put(num, 2);
		}

		for (int x = 1; x <= hashMap.size(); x++) {
			if (hashMap.get(x) == 0) {
				if (x == 1) {
					if (hashMap.get(x) == 0) {
						if (hashMap.get(x + 1) == 2) {
							hashMap.put(x + 1, 1);
							hashMap.put(x, 1);
							continue;
						}
					}
				} else if (x == hashMap.size()) {
					if (hashMap.get(x) == 0) {
						if (hashMap.get(x - 1) == 2) {
							hashMap.put(x - 1, 1);
							hashMap.put(x, 1);
							continue;
						}
					}
				} else {
					if (hashMap.get(x - 1) == 2) {
						hashMap.put(x - 1, 1);
						hashMap.put(x, 1);
						continue;
					} else if (hashMap.get(x + 1) == 2) {
						hashMap.put(x + 1, 1);
						hashMap.put(x, 1);
						continue;
					}
				}
			}
		}

		for (int x = 1; x <= hashMap.size(); x++) {
			if (hashMap.get(x) >= 1)
				answer++;
		}

		return answer;
	}
}
