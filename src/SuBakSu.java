package Programmers;

public class SuBakSu {
	public static void main(String[] args) {
		int n = 3;
		solution(n);
	}
	
	public static String solution(int n) {
		String answer = "";
		
		for(int x=1; x<=n; x++) {
			if(x%2==1)
				answer += "¼ö";
			else
				answer += "¹Ú";
		}
		return answer;
	}
}
