import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = 0;
		
		for(int x=0; x<n; x++) {
			int num = Integer.parseInt(st.nextToken());
			int stack = 0;
			
			if(num==1)
				stack++;

			for(int y=2; y<num; y++) {
				if(num%y==0) {
					stack++;
					break;
				}
			}
			
			if(stack==0)
				total++;
		}
		
		System.out.println(total);
	}
}
