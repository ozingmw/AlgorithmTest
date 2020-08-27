import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int stack = 0;

		for(int x=0; x<str.length(); x++) {
			switch(str.charAt(x)) {
			case 'A':
			case 'B':
			case 'C':
				stack += 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				stack += 4;
				break;
			case 'G':
			case 'H':
			case 'I':
				stack += 5;
				break;
			case 'J':
			case 'K':
			case 'L':
				stack += 6;
				break;
			case 'M':
			case 'N':
			case 'O':
				stack += 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				stack += 8;
				break;
			case 'T':
			case 'U':
			case 'V':
				stack += 9;
				break;
			default:
				stack += 10;
			}
		}
		
		System.out.println(stack);
	}
}
