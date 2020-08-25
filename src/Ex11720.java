import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String tmp = br.readLine();
		int num = 0;

		for(int x=0; x<n; x++)
			num += tmp.charAt(x);
		
		System.out.println(num-(48*n));
	}
}
