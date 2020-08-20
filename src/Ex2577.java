import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int num = a*b*c, R = 0;
		int n0 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0;
		
		while(num>0) {
			R = num%10;
			switch (R) {
			case 0:
				n0++;
				break;
			case 1:
				n1++;
				break;
			case 2:
				n2++;
				break;
			case 3:
				n3++;
				break;
			case 4:
				n4++;
				break;
			case 5:
				n5++;
				break;
			case 6:
				n6++;
				break;
			case 7:
				n7++;
				break;
			case 8:
				n8++;
				break;
			case 9:
				n9++;
				break;
			}
			num = num/10;
		}
		System.out.println(n0);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		System.out.println(n9);
	}
}
