package Programmers;

import java.util.Scanner;

public class PointStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int x = 0; x < b; x++) {
			for (int y = 0; y < a; y++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
