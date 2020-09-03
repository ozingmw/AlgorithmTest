import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int total = 0, lastNum = 0;
		
		for(; M<=N; N--) {
			int tmp = 0;
			
			if(N==1 && M==1)
				tmp = 1;
			
			for(int x=2; x<N; x++) {
				if(N%x==0) {
					tmp = 1;
					break;
				}
			}
			
			if(tmp==0) {
				total += N;
				lastNum = N;
			}
		}
		
		if(lastNum==0) {
			System.out.println(-1);
		}else {
			System.out.println(total);
			System.out.println(lastNum);
		}
	}
}