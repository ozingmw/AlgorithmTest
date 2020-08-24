import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int stack = 0;

		if(n<=99)
			stack = n;
		else
			stack += 99;

		for(int i=111; n>=i; i++) {
			if(n==1000) {
				stack = 144;
				break;
			}
			if(checkAP(i)==true)
				stack++;
		}
		System.out.println(stack);
	}

	private static boolean checkAP(int n) {
		int[] num = new int[3];
		int i = 0;

		while(n>0) {
			num[i] = n%10;
			n /= 10;
			i++;
		}

		if((num[0] + num[2]) == num[1]*2)
			return true;
		return false;
	}
}
