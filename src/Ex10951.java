import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		
		while(true) {
			String EOF = br.readLine();
			if(EOF == null)
				break;
			StringTokenizer st = new StringTokenizer(EOF);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			System.out.println(a+b);			
		}
	}

}