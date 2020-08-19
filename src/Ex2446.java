import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2446 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			for(int a=0; a<i-1; a++)
				System.out.print(" ");
			for(int a=0; a<n-i+1; a++)
				System.out.print('*');
			for(int a=0; a<n-i; a++)
				System.out.print('*');
			System.out.print('\n');
		}
		for(int i=1; i<=n-1; i++) {
			for(int a=0; a<n-i-1; a++)
				System.out.print(" ");
			for(int a=0; a<i+1; a++)
				System.out.print('*');
			for(int a=0; a<i; a++)
				System.out.print('*');
			System.out.print('\n');
		}
	}
}
