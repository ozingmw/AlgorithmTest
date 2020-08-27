import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String[] str = new String[tmp.length()];
		str = tmp.split(" ");

		int stack = str.length;

		if(!tmp.equals(" ")) {
			if(str[0].equals(""))
				stack--;
		}

		System.out.println(stack);
	}
}
