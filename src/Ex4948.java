import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4948 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			int M = Integer.parseInt(br.readLine());
			int stack = 0;
			if(M==0)
				break;
			if(M==1)
				stack++;

			for(int y=M+1; y<2*M; y++) {
				int tmp = 0;
				
				for(int z=2; z<=Math.sqrt(y); z++) {
					if(y%z==0) {
						tmp = 1;
						break;
					}
				}
				if(tmp==0)
					stack++;
			}
			System.out.println(stack);
		}
	}
}