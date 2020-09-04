import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1929 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int prime[] = new int[N+1];
		prime[1] = 1;
		
		for(int i=2; i<=N; i++) {
			if(prime[i]!=0)
				continue;
			for(int j = i+i; j<=N; j+=i)
				prime[j]=1;
		}
		
		for(; M<=N; M++) {
			if(prime[M]==0)
				System.out.println(M);
		}
		
	}
}