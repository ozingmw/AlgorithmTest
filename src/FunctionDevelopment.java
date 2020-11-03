package Programmers;

import java.util.Map.Entry;
import java.util.TreeMap;

public class FunctionDevelopment {
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		solution(progresses, speeds);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		int length = progresses.length;
		int days[] = new int[length];
		for(int x=0; x<length; x++)
			days[x] = (int)Math.ceil((100-progresses[x])/(double)speeds[x]);
		
		int index = 0;
		while(true) {
			if(index == length-1)
				break;
			
			if(days[index] >= days[index+1])
				days[index+1] = days[index];
			
			index++;
		}
		TreeMap<Integer, Integer> tmp = new TreeMap<Integer, Integer>();
		for(Integer temp : days) {
			tmp.put(temp, tmp.getOrDefault(temp, 0)+1);
		}
		
		int[] answer = new int[tmp.size()];
		int tmpIndex = 0;
		for (Entry<Integer, Integer> entry : tmp.entrySet()) {
			answer[tmpIndex] = entry.getValue();
			tmpIndex++;
		}
		
		return answer;
	}
}
