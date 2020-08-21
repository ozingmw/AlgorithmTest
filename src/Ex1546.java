import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		double total = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double score[] = new double[n];
		
		for(int i=0; i<n; i++) 
			score[i] = Double.parseDouble(st.nextToken());
		
		Arrays.sort(score);
		
		for(int i=0;i<n;i++)
			total += score[i];
		
		System.out.println(100/(n*score[n-1])*total);
		
	}
}
