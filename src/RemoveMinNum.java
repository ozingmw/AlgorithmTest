package Programmers;

public class RemoveMinNum {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		solution(arr);
	}
	
	public static int[] solution(int[] arr) {
		if(arr.length==1)
			return new int[] {-1};
		int min = Integer.MAX_VALUE;
		
		for(int x=0; x<arr.length; x++) {
			if(arr[x]<min)
				min = arr[x];
		}
		
		int[] answer = new int[arr.length-1];
		int a = 0;
		for(int tmp : arr) {
			if(tmp==min)
				continue;
			answer[a] = tmp;
			a++;
		}
		return answer;
	}
}
