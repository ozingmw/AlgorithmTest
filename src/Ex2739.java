import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		int N = 1;
		while(N<10) {
			System.out.println(a + " * " + N + " = " + a*N);
			N++;
		}
	}

}
