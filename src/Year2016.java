package Programmers;

public class Year2016 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		solution(a, b);
	}

	public static String solution(int a, int b) {
		int monthOfDay[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String nameOfDay[] = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int month = a - 1;
		int day = b - 1;
		int dayDifference = 0;

		for (int x = 0; x < month; x++) {
			dayDifference += monthOfDay[x];
		}
		dayDifference = (dayDifference + day) % 7;

		String answer = nameOfDay[dayDifference];
		return answer;
	}
}
