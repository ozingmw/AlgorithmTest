package Programmers;

public class DrugNumSum {
	public static void main(String[] args) {
		int n = 12;
		solution(n);
	}
	
	public static int solution(int n) {
		int allNum = 0;
		for(int x=1; x<=n; x++) {
			if(n%x==0) {
				allNum += x;
			}
		}
		return allNum;
	}
}
