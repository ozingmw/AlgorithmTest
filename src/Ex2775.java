import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for(int x=0; x<num; x++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			System.out.println(addnext(k, n));
		}
	}

	private static int addnext(int k, int n) {
		if(k==0 || n==1) {
			if(k==0)
				return n;
			else
				return 1;
		}
		return addnext(k, n-1) + addnext(k-1, n);
	}
}
