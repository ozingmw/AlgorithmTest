package Programmers;

public class StringInpy {
	public static void main(String[] args) {
		String s = "pPooyY";
		solution(s);
	}

	public static boolean solution(String s) {
		boolean answer = true;
		
		int pNum = 0, yNum = 0;
		
		for(int x=0; x<s.length(); x++) {
			if(s.charAt(x)=='p') {
				pNum++;
			}else if(s.charAt(x)=='P') {
				pNum++;
			}else if(s.charAt(x)=='y') {
				yNum++;
			}else if(s.charAt(x)=='Y') {
				yNum++;
			}
		}
		
		if(pNum!=yNum)
			answer = true;
		
		return answer;
	}
}
