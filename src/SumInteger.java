package Programmers;

public class SumInteger {
	public static void main(String[] args) {
		int a=5, b=3;
		solution(a,b);
	}
	
	public static long solution(int a, int b) {
		return (long)(a+b)*Math.abs(b-a+1)/2;
	}
}
