import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=T;i++) {
			for(int a=T-i;a>0;a--)
				System.out.print(" ");
			for(int n=i;n>0;n--)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
