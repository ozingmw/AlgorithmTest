import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int line = 1, stack = 2;
		
		if(num==1)
			stack--;
		
		while(num>6*line+1) {
			num -= (6*line);
			line++;
			stack++;
		}
		System.out.println(stack);
	}
}
// 1 000 000 000 -> 18258
