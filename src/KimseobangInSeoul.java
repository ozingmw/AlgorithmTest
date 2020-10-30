package Programmers;

public class KimseobangInSeoul {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		solution(seoul);
	}
	
	public static String solution(String[] seoul) {
		int stack = 0;
		for(String name : seoul) {
			if(name.equals("Kim"))
				break;
			stack++;
		}
		String answer = "김서방은 ";
		answer = answer + stack + "에 있다";
		return answer;
	}
}
