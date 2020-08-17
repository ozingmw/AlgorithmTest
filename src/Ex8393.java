import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int total=0;
			
			for(;n>0;n--) {
				total += n;
			}
			
			System.out.println(total);
	}

}
