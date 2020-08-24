
public class Ex4673 {
	public static void main(String[] args) {
		int[] num = new int[10001];
		int selNum = 0;
		num[0] = 1;
		
		for(int i=1; i<=10000; i++) {
			selNum = selfNumber(i);
			if(selNum<=10000)
				num[selNum] = 1;
		}
		
		for(int i=0; i<=10000; i++) {
			if(num[i] != 1)
				System.out.println(i);
		}
	}

	private static int selfNumber(int n) {
		int selfNum = n;

		while(n>0) {
			selfNum += n%10;
			n /= 10;
		}

		return selfNum;
	}
}
