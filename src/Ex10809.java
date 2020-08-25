import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eng = br.readLine();
		int[] num = new int[26];
		
		for(int x=0; x<26; x++)
			num[x] = -1;
		
		for(int x=0; x<eng.length(); x++) {
			if(num[eng.charAt(x)-97]!=-1)
				continue;
			num[eng.charAt(x)-97] = x;
			
		}
		for(int x=0; x<26; x++)
			System.out.print(num[x] + " ");
	}
}
