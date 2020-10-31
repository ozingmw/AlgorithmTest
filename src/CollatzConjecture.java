package Programmers;

public class CollatzConjecture {
	public static void main(String[] args) {
		int num = 626331;
		solution(num);
	}

	public static int solution(int num) {
		int stack = 0;
		long x = num;
		while (x != 1) {
			if (x % 2 == 0) {
				x /= 2;
			} else {
				x = x * 3 + 1;
			}
			stack++;
			if(stack>=500) {
				stack = -1;
				break;
			}
		}
		return stack;
	}
}
