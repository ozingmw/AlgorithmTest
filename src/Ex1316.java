import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int wordNum = 0;

		for(int x=0; x<n; x++) {
			String groupWord= br.readLine();
			groupWord += '.';
			char[] wordInclude = new char[groupWord.length()];
			int wordIndex = 0, tmp = 0;

			for(int y=0; y<groupWord.length(); y++) {
				if(groupWord.charAt(y)=='.')
					break;
				if(groupWord.charAt(y)==groupWord.charAt(y+1)) {
					continue;
				}else {
					wordInclude[wordIndex] = groupWord.charAt(y);
					wordIndex++;
				}
			}

			for(int y=0; y<wordIndex; y++) {
				for(int z=y+1; z<wordIndex; z++) {
					if(wordInclude[y]==wordInclude[z]) {
						tmp = -1;
						break;
					}
				}
			}
			if(tmp>=0)
				wordNum++;

		}
		System.out.println(wordNum);
	}
}
