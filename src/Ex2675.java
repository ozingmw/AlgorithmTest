import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int x=0; x<T; x++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int mul = Integer.parseInt(st.nextToken());
			String tmp = st.nextToken();
			String[] str = tmp.split("");
			
			for(int y=0; y<str.length; y++) {
				String tmpChar = str[y];
				for(int z=1; z<mul; z++)
					str[y] += tmpChar;
				System.out.print(str[y]);
			}
			System.out.println();
			
			
		}
	}
}
