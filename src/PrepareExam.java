package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrepareExam {
	public static void main(String[] args) {
		int[] answer = {1,3,2,4,2};
		solution(answer);
	}

	public static ArrayList<Integer> solution(int[] answer) {
		Map<Integer, Integer> score = new HashMap<Integer, Integer>(3);
		int s1, s2, s3, max;

		ArrayList<Integer> GUM1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> GUM2 = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
		ArrayList<Integer> GUM3 = new ArrayList<Integer>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

		GUM1 = equalize(answer, GUM1);
		GUM2 = equalize(answer, GUM2);
		GUM3 = equalize(answer, GUM3);

		score.put(1, grading(answer, GUM1));
		score.put(2, grading(answer, GUM2));
		score.put(3, grading(answer, GUM3));

		s1 = score.get(1);
		s2 = score.get(2);
		s3 = score.get(3);

		max = s1 >= s2 ? (s1 >= s3 ? s1 : s3) : (s2 >= s3 ? s2 : s3);

		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int x=1; x<=3; x++) {
			if(max == score.get(x)) {
				result.add(x);
			}
		}
		
        return result;
	}

	private static ArrayList<Integer> equalize(int[] answer, ArrayList<Integer> GUM) {
		int tmp = Math.abs(answer.length - GUM.size())+1;
		if (answer.length != GUM.size()) {
			for (int x = 0; x < tmp; x++) {
				if (answer.length > GUM.size()) {
					GUM.add(GUM.get(x));
				} else if (answer.length < GUM.size()) {
					GUM.remove(GUM.size() - 1);
				} else {
					break;
				}
			}
		}
		return GUM;
	}

	private static int grading(int[] answer, ArrayList<Integer> GUM) {
		int stack = 0;

		for (int x = 0; x < answer.length; x++) {
			if (answer[x] == GUM.get(x)) {
				stack++;
			}
		}
		return stack;
	}
}