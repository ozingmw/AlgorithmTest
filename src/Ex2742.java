import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2742 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n>0) {
			System.out.println(n);
			n--;
		}
	}
}