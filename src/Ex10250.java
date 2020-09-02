import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int x=0; x<T; x++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int line = n%h==0 ? n/h : n/h+1;
			
			System.out.println((n%h*100 != 0 ? n%h*100 : h*100) + line);
		}
	}
}
