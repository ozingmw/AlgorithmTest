import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int numArr[] = new int[n];
		
		for(int x=0; x<n; x++)
			numArr[x] = Integer.parseInt(br.readLine());
		
		Arrays.sort(numArr);
		
		for(int x=0; x<n; x++)
			System.out.println(numArr[x]);
	}
}
