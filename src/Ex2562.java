import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE, stack = 0;
		
		for(int i=1; i<=9; i++) {
			int num = Integer.parseInt(br.readLine()); 
			if(num>=max) {
				max = num;
				stack = i;
			}
		}
		System.out.println(max);
		System.out.println(stack);
	}
}
