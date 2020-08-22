import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		int total = 0, stack = 0;

		for(int x=0; x<c; x++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());

			int[] score = new int[num];
			
			for(int y=0; y<num; y++) {
				score[y] = Integer.parseInt(st.nextToken());
			}
			
			for(int y=0; y<num; y++) {
				total += score[y];
			}
			total = total/num;
			
			for(int y=0; y<num; y++) {
				if(score[y]>total)
					stack++;
			}
			
			System.out.printf("%.3f", (double)stack*100/num);
			System.out.println("%");
			
			total = 0;
			stack = 0;
		}
	}
}
