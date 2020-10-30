package Programmers;

public class CheckRoot {
	public static void main(String[] args) {
		long n = 121;
		solution(n);
	}
	
	public static long solution(long n) {
		if(Math.sqrt(n) == (int)Math.sqrt(n)) {
			return (long) Math.pow((Math.sqrt(n)+1),2);
		}
		return -1;
	}
}
