import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n[] = new int[10];
		int stack = 10;

		for(int x=0; x<10; x++) {
			n[x] = (Integer.parseInt(br.readLine()))%42;
			for(int y=0; y<x; y++) {
				if(n[x]==n[y]) {
					stack--;
					break;
				}
			}
		}

		System.out.println(stack);
	}
}
