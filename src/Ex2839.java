import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int firstNum = num;
		int stack = 0;

		stack += num/5;
		num %= 5;

		while(num>0) {
			if(num%3==0) {
				stack += num/3;
				num %= 3;
			}else {
				if(firstNum > num) {
					num += 5;
					stack--;
				}else {
					stack = -1;
					break;
				}
			}
		}

		System.out.println(stack);

	}
}
