package Programmers;

public class IntervalX {
	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		solution(x, n);
	}

	public static long[] solution(long x, int n) {
		long answer[] = new long[n];
		long tmp = x;
		for (int a = 0; a < n; a++) {
			answer[a] = x;
			x += tmp;
		}
		return answer;
	}
}
