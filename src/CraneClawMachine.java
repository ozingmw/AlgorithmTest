package Programmers;

import java.util.ArrayList;

/*
 * board N*N크기 상자에서 moves에 있는 해당 숫자 열에서 인형 하나 뽑기
 * 
 */

public class CraneClawMachine {	
	public static void main(String[] args) {
		int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[] = {1,5,3,5,1,2,1,4};
		solution(board, moves);
	}
	
	public static int solution(int[][] board, int[] moves) {
		ArrayList<Integer> matchCan = new ArrayList<>();
		int answer = 0;
		
		for(int move : moves) {
			for(int a=0; a<board[0].length; a++) {
				if(board[a][move-1]!=0) {
					matchCan.add(board[a][move-1]);
					board[a][move-1] = 0;

					if(checkMatch(matchCan)==true)
						answer += 2;
					break;
				}
			}
		}
		return answer;
    }

	private static boolean checkMatch(ArrayList<Integer> matchCan) {
		if(matchCan.size()==1)
			return false;
		if(matchCan.get(matchCan.size()-1) == matchCan.get(matchCan.size()-2)) {
			matchCan.remove(matchCan.size()-1);
			matchCan.remove(matchCan.size()-1);
			return true;
		}
		return false;
	}
}
