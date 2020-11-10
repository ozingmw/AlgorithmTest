package Programmers;

public class StockPrice {
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		solution(prices);
	}
	
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		
		for(int x=0; x<prices.length; x++) {
			int stack = 0;
			
			for(int y=x+1; y<prices.length; y++) {
				stack++;
				if(prices[x]>prices[y]) {
					answer[x] = stack;
					break;
				}
			}
			answer[x] = stack;
		}
		return answer;
	}
}
