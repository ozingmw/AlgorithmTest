package Programmers;

import java.util.Arrays;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 10;
		solution(n);
	}

	public static int solution(int n) {
		int[] primeNum = new int[n+1];
		Arrays.fill(primeNum, 1);
		int stack = 0;
		primeNum[0] = 0;
		primeNum[1] = 0;
		
		for(int x=2; x<=n; x++) {
			if(primeNum[x]==1) {
				for(int y=x*2; y<=n; y+=x) {
					primeNum[y]=0;
				}
			}
		}
		for(int x=2; x<=n; x++) {
			if(primeNum[x]==1)
				stack++;
		}
		
		return stack;
	}
}
