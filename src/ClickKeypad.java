package Programmers;

public class ClickKeypad {
	public static void main(String[] args) {
		int[] number = {7,0,8,2,8,3,1,5,7,6,2};
		String hand = "left";
		solution(number, hand);
	}
	
	public static String solution(int[] number, String hand) {
//		1,4,7,* -> L
//		3,6,9,# -> R
//		2,5,8,0 -> 가까운(같으면 손)
		String answer = "";
		int lastL = 10, lastR = 12;
		
		for(int x=0; x<number.length; x++) {
			if(number[x]==1 || number[x]==4 || number[x]==7) {
				answer += "L";
				lastL = number[x];
			}else if(number[x]==3 || number[x]==6 || number[x]==9) {
				answer += "R";
				lastR = number[x];
			}else {
				char tmp = CompareDistance(number[x], lastL, lastR);
				if(tmp == 'R') {
					answer +="R";
					lastR = number[x];
				}else if(tmp == 'L') {
					answer += "L";
					lastL = number[x];
				}else {
					if(hand.equals("right")) {
						answer += "R";
						lastR = number[x];
					}else {
						answer += "L";
						lastL = number[x];
					}
				}
			}
		}
		return answer;
	}

	public static Character CompareDistance(int i, int lastL, int lastR) {
		if(i == 0)
			i = 11;
		if(lastL == 0)
			lastL = 11;
		if(lastR == 0)
			lastR = 11;
		
		int x = (i-1)/3, y = (i-1)%3;
		int targetLeftX = (lastL-1)/3, targetLeftY = (lastL-1)%3;
		int targetRightX = (lastR-1)/3, targetRightY = (lastR-1)%3;
		
		int distanceL = Math.abs(targetLeftX-x) + Math.abs(targetLeftY - y);
		int distanceR = Math.abs(targetRightX-x) + Math.abs(targetRightY - y);
		
		if(distanceR < distanceL)
			return 'R';
		else if (distanceL == distanceR)
			return 'S';
		else
			return 'L';
	}
}
