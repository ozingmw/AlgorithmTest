import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2447 {
	static String[][] star;
	static StringBuilder[] sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		star = new String[num][num];
		sb[num] = new StringBuilder();
		
		
		re_star(num,0,0);
		
		for(int x=0; x<num; x++) {
			for(int y=0; y<num; y++) {
				if(star[x][y]!=null)
					System.out.print(star[x][y]);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		for(int x=0; x<num; x++)
			System.out.println(sb[x].toString());
	}
	
	private static void re_star(int num, int x, int y) {
		if(num==1) {
			star[x][y] = "*";
			sb[x].append("*");
			return;
		}
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				if(a==1 && b==1) {
					sb[x].append(" ");
					continue;
				}
				re_star(num/3, x+num/3*a, y+num/3*b);
			}
		}
		return;
	}
}
