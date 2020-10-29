package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayString {
	public static void main(String[] args) {
		String s = "Zbcgdef";
		solution(s);
	}
	
	public static String solution(String s) {
		List<Character> answer = new ArrayList<>();
		for(int x=0; x<s.length(); x++)
			answer.add(s.charAt(x));
		Collections.sort(answer);	
		Collections.reverse(answer);
		String[] str = new String[1];
		str[0] = "";
		for(Character tmp : answer)
			str[0] += tmp;
		return str[0].toString();
	}
}
