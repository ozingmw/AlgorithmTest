package Programmers;

public class HarshadNumber {
	public static void main(String[] args) {
		int x = 13;
		solution(x);
	}
	
	public static boolean solution(int x) {
		int num = 0, tmp = x;
		while(x>0) {
			num += x%10;
			x /= 10;
		}
		if(tmp%num==0)
			return true;
		return false;
	}
}
