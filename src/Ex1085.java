import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int min = 0;
		
		if(x>=w-x)
			min = w-x;
		else
			min = x;
		
		if(y>=h-y) {
			if(min>h-y)
				System.out.println(h-y);
			else
				System.out.println(min);
		}else {
			if(min>y)
				System.out.println(y);
			else
				System.out.println(min);
		}
		
	}
}
