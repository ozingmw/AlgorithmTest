package Programmers;

public class FindAverage {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		solution(arr);
	}
	
	public static double solution(int[] arr) {
		double avg = 0;
		for(int tmp : arr) {
			avg += tmp;
		}
		return avg/arr.length;
	}
}
