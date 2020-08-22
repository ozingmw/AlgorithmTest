import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] caseArray = new String[n][];
		int[][] transArray = new int[n][];

		for(int x=0; x<n; x++) {
			String tmp = br.readLine();
			caseArray[x] = tmp.split("");
		}
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<caseArray[x].length; y++) {
				System.out.println(caseArray[x][y]);
				if(caseArray[x][y]=="O") {
					if(y==0)
						transArray[x][y] = 1;
					else
						transArray[x][y] = transArray[x][y-1] + 1;
				}
				else
					transArray[x][y] = 0;
			}
		}
		
		for(int x=0; x<n; x++) {
			for(int y=1; y<transArray[x].length; y++) {
				transArray[x][0] += transArray[x][y];
			}
		}

		for(int x=0; x<n; x++) {
			System.out.println(transArray[x][0]);
		}
	}
}
