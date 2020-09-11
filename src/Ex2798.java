import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		
		int num[] = new int[n];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int x=0; x<n; x++)
			num[x] = Integer.parseInt(st2.nextToken());
		
		int blackJack = 0;
		
		for(int x=0; x<n-2; x++) {
			for(int y=x+1; y<n-1; y++) {
				for(int z=y+1; z<n; z++) {
					int tmp = num[x]+num[y]+num[z];
					if(tmp >= blackJack && tmp <= m)
						blackJack = tmp;
				}
			}
		}
		
		System.out.println(blackJack);
	}
}
