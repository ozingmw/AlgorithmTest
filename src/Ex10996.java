import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10996 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int line = 0;

		if(n==1) {
			System.out.println('*');
		}else {
			for(int i=1; i<=n; i++) {
				for(int a=0;a<n;a++) {
					if(line%2==0)
						System.out.print('*');
					else
						System.out.print(' ');
					line++;
				}
				
				line = 0;
				System.out.println();
				
				for(int a=0;a<n;a++) {
					if(line%2==1)
						System.out.print('*');
					else
						System.out.print(' ');
					line++;
				}
				
				System.out.println();
				line = 0;
				
			}
		}
	}
}

