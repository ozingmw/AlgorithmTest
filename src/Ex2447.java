import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2447 {
	static String[][] star;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		star = new String[num][num];
		
		re_star(num,0,0);
	}
	
	private static void re_star(int num, int x, int y) {
		if(num<=0) {
			star[0][0] = "*";
			return;
		}
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				if(a==1 && b==1)
					continue;
				re_star(num/3, x+num/3*a, y+num/3*b);
			}
		}
		return;
	}
}
