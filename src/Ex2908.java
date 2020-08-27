import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c2a = 0, c2b = 0, multen = 100;
		
		for(int x=0; x<3; x++) {
			c2a += a%10*multen;
			c2b += b%10*multen;
			a /= 10;
			b /= 10;
			multen /= 10;
		}
		
		if(c2a>= c2b)
			System.out.println(c2a);
		else
			System.out.println(c2b);
	}
}
