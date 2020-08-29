import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int fixedCost = Integer.parseInt(st.nextToken());
		int variableCost = Integer.parseInt(st.nextToken());
		int revenue = Integer.parseInt(st.nextToken());
		

		if(revenue > variableCost) {
			int num = fixedCost / (revenue-variableCost);
			System.out.println(num+1);
		}else
			System.out.println(-1);
	}
}
