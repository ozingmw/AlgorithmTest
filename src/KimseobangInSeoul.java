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
		String answer = "�輭���� ";
		answer = answer + stack + "�� �ִ�";
		return answer;
	}
}
