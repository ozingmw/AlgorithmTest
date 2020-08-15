import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = a*b;
		while(b>0) {
			System.out.println(a*(b%10));
			b = b/10;
		}
		System.out.println(c);
	}

}
