import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n[] = new int[3];
			
			for(int x=0; x<3; x++)
				n[x] = Integer.parseInt(st.nextToken());
			
			if(n[0]==0)
				break;
			
			Arrays.sort(n);
			
			if(n[2]*n[2]==n[1]*n[1]+n[0]*n[0])
				System.out.println("right");
			else
				System.out.println("wrong");
			
		}
	}
}
