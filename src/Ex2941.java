import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str+'.';
		int num = 0;

		for(int x=0; x<str.length(); x++) {
			if(nowStr(str, x)=='.')
				break;
			if(nowStr(str, x)=='c') {
				if(nowStr(str, x+1)=='=' || nowStr(str, x+1)=='-') {
					x++;
				}
			}else if(nowStr(str, x)=='d') {
				if(nowStr(str, x+1)=='z'){
					if(nowStr(str, x+2)=='=') {
						x += 2;
					}
				}else if(nowStr(str, x+1)=='-') {
					x++;
				}
			}else if(nowStr(str, x)=='l') {
				if(nowStr(str, x+1)=='j') {
					x++;
				}
			}else if(nowStr(str, x)=='n') {
				if(nowStr(str, x+1)=='j') {
					x++;
				}
			}else if(nowStr(str, x)=='s') {
				if(nowStr(str, x+1)=='=') {
					x++;
				}
			}else if(nowStr(str, x)=='z'){
				if(nowStr(str, x+1)=='=')
					x++;
			}
			num++;
		}
		System.out.println(num);
	}

	private static char nowStr(String str, int x) {
		return str.charAt(x);
	}
}
