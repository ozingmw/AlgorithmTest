import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tmp = Integer.parseInt(st.nextToken());
		
		int max = tmp, min = tmp;
		
		for(int i=0; i<n-1; i++) {
			int num = Integer.parseInt(st.nextToken());
			max = num >= max ? num : max;
			min = num <= min ? num : min;
		}
		System.out.println(min + " " + max);
	}
}
