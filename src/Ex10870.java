import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(num));
	}
	
	private static int fibonacci(int num) {
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		
		return fibonacci(num-1)+fibonacci(num-2);
	}
}
