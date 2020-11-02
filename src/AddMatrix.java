package Programmers;

public class AddMatrix {
	public static void main(String[] args) {
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		solution(arr1, arr2);
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2){
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int x=0; x<arr1.length; x++) {
			for(int y=0; y<arr1[x].length; y++) {
				answer[x][y] = arr1[x][y] + arr2[x][y];
			}
		}
		
		return answer;
	}
}
