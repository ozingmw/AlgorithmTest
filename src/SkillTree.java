package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class SkillTree {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		solution(skill, skill_trees);
	}
	
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		
		for(int x=0; x<skill_trees.length; x++) {
			int[] skillArray = new int[skill_trees[x].length()];
			int stack = 1;
			int max = -1;
			
			for(int y=0; y<skill.length(); y++) {
				int indexOfChar = skill_trees[x].indexOf(skill.charAt(y));
				if(indexOfChar != -1) {
					skillArray[indexOfChar] = stack;
					max = stack;
				}
				stack++;
			}
			
			if(max == -1 || max == 1) {
				answer++;
				continue;
			}
			
			ArrayList<Integer> skillArrayToSimple = new ArrayList<Integer>();
			for(int y=0; y<skillArray.length; y++) {
				if(skillArray[y]!=0) {
					skillArrayToSimple.add(skillArray[y]);
				}	
			}
			
			if(skillArrayToSimple.size()==0) {
				answer++;
				continue;
			}
			
			ArrayList<Integer> clone = (ArrayList<Integer>) skillArrayToSimple.clone();
			Collections.sort(clone);
			
			if(max==skillArrayToSimple.size()) {
				if(clone.equals(skillArrayToSimple)) {
					answer++;
					continue;
				}
			}
		}
		return answer;
	}
}
