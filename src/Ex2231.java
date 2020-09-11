import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int check = 0;
		
		for(int x=0; x<=num; x++) {
			int singleNum = x, orgNum = x, divX = x;
			while(divX>=1) {
				singleNum += divX%10;
				divX /= 10;
			}
			if(singleNum == num) {
				System.out.println(orgNum);
				check = 1;
				break;
			}
		}
		
		if(check == 0)
			System.out.println(0);
	}
}
