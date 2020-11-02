package Programmers;

public class PhoneNumberToStar {
	public static void main(String[] args) {
		String phone_number = "027778888";
		solution(phone_number);
	}
	
	public static String solution(String phone_number) {
		String answer = "";
		for(int x=0; x<phone_number.length()-4; x++) {
			answer += "*";
		}
		return answer = answer + phone_number.substring(phone_number.length()-4, phone_number.length());
	}
}
