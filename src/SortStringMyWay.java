package Programmers;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortStringMyWay {
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		solution(strings, n);
	}
	
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings);
		Map<String, Integer> chickenDayMap = new TreeMap<String, Integer>();
		for(int x=0; x<strings.length; x++) {
			chickenDayMap.put(Character.toString(strings[x].charAt(n)), chickenDayMap.getOrDefault(Character.toString(strings[x].charAt(n)), 0)+1);
		}
		
		String[][] str = new String[strings.length][2];
		for(int x=0; x<strings.length; x++) {
			str[x][0] = Character.toString(strings[x].charAt(n));
		}
		for(int x=0; x<strings.length; x++) {
			str[x][1] = strings[x];
		}
		
		String[] answer = new String[strings.length];
		int num = 0;
		for(Entry<String, Integer> tmp : chickenDayMap.entrySet()) {
			for(int x=0; x<strings.length; x++) {
				if(str[x][0].equals(tmp.getKey())) {
					answer[num++] = str[x][1];
				}
			}
		}
		return answer;
	}
}
