package Programmers;

public class CheckString {
	public static void main(String[] args) {
		String s = "a234";
		solution(s);
	}
	
	public static boolean solution(String s) {
		boolean answer = true;
		
		if(s.length()==4 || s.length()==6) {
			for(int x=0; x<s.length(); x++) {
				if(s.charAt(x)>='0' && s.charAt(x)<='9') {
					continue;
				}else {
					answer = false;
					break;
				}
			}	
		}else {
			answer = false;
		}
		return answer;
	}
}
