package Programmers;

public class DartGame {
	public static void main(String[] args) {
		String dartResult = "1S*2T*3S";
		solution(dartResult);
	}
	
	public static int solution(String dartResult) {
		String round[] = new String[3]; 
		round = DartResultSplit(dartResult);
		int result[] = new int[3];
		result[0] = RoundToResult(round[0]);
		result[1] = RoundToResult(round[1]);
		result[2] = RoundToResult(round[2]);
		return DartTotalResult(result[0], result[1], result[2], round[0], round[1], round[2]);
	}

	public static String[] DartResultSplit(String dartResult) {
		int index = 0, roundIndex = 0;
		String[] round = new String[3];
		
		while(dartResult.length()>0) {
			if(Character.isDigit(dartResult.charAt(index))==false) {
				if(index==dartResult.length()-1) {
					round[2] = dartResult;
					break;
				}else if(dartResult.charAt(index+1)=='*' || dartResult.charAt(index+1)=='#') {
					round[roundIndex] = dartResult.substring(0, index+2);
					dartResult = dartResult.substring(index+2, dartResult.length());
					index = 0;
					roundIndex++;
				}else {
					round[roundIndex] = dartResult.substring(0, index+1);
					dartResult = dartResult.substring(index+1, dartResult.length());
					index = 0;
					roundIndex++;
				}
			}
			index++;
		}
		return round;
	}

	public static int RoundToResult(String roundResult) {
		int result = 0;
		for(int x=0; x<roundResult.length(); x++) {
			if(Character.isDigit(roundResult.charAt(x))==false) {
				result = Integer.parseInt(roundResult.substring(0, x));
				if(roundResult.charAt(x)=='S') {
					return (int)Math.pow(result, 1);
				}else if(roundResult.charAt(x)=='D') {
					return (int)Math.pow(result, 2);
				}else {
					return (int)Math.pow(result, 3);
				}
			}
		}
		return 0;
	}

	public static int DartTotalResult(int r1, int r2, int r3, String s1, String s2, String s3) {
		if(s1.charAt(s1.length()-1) == '*')
			r1 *= 2;
		if(s1.charAt(s1.length()-1) == '#')
			r1 = (-r1);
		if(s2.charAt(s2.length()-1) == '*') {
			r1 *= 2;
			r2 *= 2;
		}
		if(s2.charAt(s2.length()-1) == '#')
			r2 = (-r2);
		if(s3.charAt(s3.length()-1) == '*') {
			r2 *= 2;
			r3 *= 2;
		}
		if(s3.charAt(s3.length()-1) == '#')
			r3 = (-r3);
		
		return r1+r2+r3;
	}
}
