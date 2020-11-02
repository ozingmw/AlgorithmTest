package Programmers;

public class SecretMap {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		solution(n,arr1,arr2);
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		String[] arr1ToBinary = new String[n];
		String[] arr2ToBinary = new String[n];
		
		for(int x=0; x<n; x++) {
			arr1ToBinary[x] = Integer.toBinaryString(arr1[x]);
			while(arr1ToBinary[x].length()<n) {
				arr1ToBinary[x] = "0" + arr1ToBinary[x];	
			}
		}
		for(int x=0; x<n; x++) {
			arr2ToBinary[x] = Integer.toBinaryString(arr2[x]);
			while(arr2ToBinary[x].length()<n) {
				arr2ToBinary[x] = "0" + arr2ToBinary[x];	
			}
		}
		for(int x=0; x<n; x++) {
			answer[x] = "";
			for(int y=0; y<n; y++) {
				if(arr1ToBinary[x].charAt(y)=='1' || arr2ToBinary[x].charAt(y)=='1')
					answer[x] += "#";
				else {
					answer[x] += " ";
				}	
			}
		}
		return answer;
	}
}
