import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Ex2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int numList[] = new int[n];
		int avg = 0;
		int maxNum = -1;
		boolean modes = false;
		Stack<Integer> modeNum = new Stack<>();
		int plusMode[] = new int[4001];
		int minusMode[] = new int[4001];
		
		for(int x=0; x<n; x++) {
			numList[x] = Integer.parseInt(br.readLine());
			if(numList[x]>=0)
				plusMode[numList[x]]++;
			else
				minusMode[-numList[x]]++;
			avg += numList[x];
		}
		Arrays.sort(numList);
		
		for(int x=0; x<=4000; x++) {
			if(plusMode[x]==0)
				continue;
			if(maxNum < plusMode[x]) {
				modeNum.clear();
				modeNum.push(x);
				maxNum = plusMode[x];
				modes = false;
			}
			else if(maxNum == plusMode[x]) {
				modes = true;
				modeNum.push(x);
			}
		}
		for(int x=0; x<=4000; x++) {
			if(minusMode[x]==0)
				continue;
			if(maxNum < minusMode[x]) {
				modeNum.clear();
				modeNum.push(-x);
				maxNum = minusMode[x];
				modes = false;
			}
			else if(maxNum == minusMode[x]) {
				modes = true;
				modeNum.push(-x);
			}
		}
		
		System.out.println(Math.round((float)avg/n));
		System.out.println(numList[n/2]);
		if(modes == true) {
			int tmp[] = new int[modeNum.size()];
			for(int x=0; !modeNum.empty(); x++) {
				tmp[x] = modeNum.pop();
			}
			Arrays.sort(tmp);
			System.out.println(tmp[1]);
		}
		else
			System.out.println(modeNum.pop());
		System.out.println(numList[n-1]-numList[0]);
	}
}
