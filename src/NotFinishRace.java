package Programmers;

import java.util.HashMap;
import java.util.Map;

public class NotFinishRace {
	public static void main(String[] args) {
		String[] participant = { "a", "b", "a", "c" };
		String[] completion = { "b", "c", "a" };
		solution(participant, completion);
	}

	public static String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> answer = new HashMap<>();
		
		for(String part : participant) {
			answer.put(part, answer.getOrDefault(part, 0)+1);
		}
		
		for(String com : completion) {
			answer.replace(com, answer.get(com)-1);
		}
		
		for(Map.Entry<String, Integer> tmp : answer.entrySet()) {
			if(tmp.getValue()==1) {
				return tmp.getKey();
			}
		}
		return null;
	}
}
