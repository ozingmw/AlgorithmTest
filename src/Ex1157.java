import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] change2capital = new char[str.length()];
		int[] strNum = new int[26];
		int max = 0, maxIndex = 0, checkMax = 0;
		
		for(int x=0; x<str.length(); x++) {
			change2capital[x] = str.charAt(x);
			if(change2capital[x]>=65 && change2capital[x]<=90) {
				strNum[change2capital[x]-65]++;
			}else {
				strNum[change2capital[x]-97]++;
			}
		}
		
		for(int x=0; x<26; x++) {
			if(strNum[x]>max) {
				max = strNum[x];
				maxIndex = x;
				checkMax = 0;
			}else if(strNum[x]==max) {
				checkMax = 1;
			}
		}
		
		if(checkMax==0) {
			System.out.println((char)(maxIndex+65));
		}else {
			System.out.println("?");
		}
		
		
	}
}
