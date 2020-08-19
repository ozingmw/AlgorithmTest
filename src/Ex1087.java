import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1087 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int stack = 0;

		if(a>b)
			stack++;
		if(a>c)
			stack++;

		if(stack==2 || stack==0) {
			if(stack==0) {
				if(b>c)
					System.out.println(c);
				else
					System.out.println(b);
			}else {
				if(b>c)
					System.out.println(b);
				else
					System.out.println(c);
			}
		}else {
			System.out.println(a);
		}
	}

}
