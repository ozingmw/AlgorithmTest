import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int[] number = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++)
			number[i] = Integer.parseInt(st.nextToken());
		
		String str = "";
		
		for(int i=0;i<N;i++)
			if(number[i]<x)
				str += number[i]+" ";
		System.out.println(str.trim());
	}

}
