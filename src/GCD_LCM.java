package Programmers;

public class GCD_LCM {
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		solution(n,m);
	}
	
	public static int[] solution(int n, int m) {
		int GCD = 1;
		for(int x=2; x<=Math.min(n, m); x++) {
			if(n%x==0&&m%x==0)
				GCD = x;
		}
		int LCM = n*m/GCD;
		
		return new int[] {GCD, LCM};
	}
}
