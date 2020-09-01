import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int line = 1;
		
		while(num>line) {
			num -= line;
			line++;
		}
		if(line%2==0)
			System.out.print(num + "/" + (line+1-num));
		else
			System.out.println((line+1-num) + "/" + num);
	}
}
