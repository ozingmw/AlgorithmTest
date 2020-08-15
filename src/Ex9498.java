import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9498 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		char grade;
		
		if (a<=100 && a>=90)
			grade = 'A';
		else if(a>=80 && a<90)
			grade = 'B';
		else if(a>=70 && a<80)
			grade = 'C';
		else if(a>=60 && a<70)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println(grade);
	}

}
