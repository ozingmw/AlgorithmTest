import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5543 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int HBug = Integer.parseInt(br.readLine());
		int MBug = Integer.parseInt(br.readLine());
		int LBug = Integer.parseInt(br.readLine());
		int cola = Integer.parseInt(br.readLine());
		int soda = Integer.parseInt(br.readLine());
		int cost = 0, total = 0;
		
		cost = HBug>=MBug ? (MBug>=LBug ? LBug : MBug) : (HBug>=LBug ? LBug : HBug);
		total += cost;
		cost = cola>=soda ? soda : cola;
		total += cost;
		
		System.out.println(total-50);
		
	}

}
