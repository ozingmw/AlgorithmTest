import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1002 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int x=0; x<n; x++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xyr[] = new int[6];
			double distance = 0;

			for(int y=0; y<6; y++)
				xyr[y] = Integer.parseInt(st.nextToken());

			distance = Math.sqrt(Math.pow((xyr[0]-xyr[3]), 2) + Math.pow(xyr[1]-xyr[4], 2));

			if(distance > xyr[2] + xyr[5])
				System.out.println(0);
			else if (distance == xyr[2] + xyr[5])
				System.out.println(1);
			else {
				if(distance==0) {
					if(xyr[2]==xyr[5])
						System.out.println(-1);
					else
						System.out.println(0);
				}else {
					if(xyr[2]>xyr[5]) {
						if(distance+xyr[5]>xyr[2])
							System.out.println(2);
						else if(distance+xyr[5]==xyr[2])
							System.out.println(1);
						else
							System.out.println(0);
					}else {
						if(distance+xyr[2]>xyr[5])
							System.out.println(2);
						else if(distance+xyr[2]==xyr[5])
							System.out.println(1);
						else
							System.out.println(0);}
				}
			}
		}
	}
}
