import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cycle = 0, nextNum = 0, tmp = 0;

		tmp = num;
		
		if(num == 0)
			cycle++;
		
		for(;nextNum != num;) {
			nextNum = tmp/10 + tmp%10;
			tmp = tmp%10;
			nextNum = tmp*10 + nextNum%10;
			tmp = nextNum;
 			cycle++;
		}
		
		System.out.println(cycle);
	}

}
