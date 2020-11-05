package Programmers;

public class FineQuadrangle {
	public static void main(String[] args) {
		int w = 158928;
		int h = 68444;
		solution(w, h);
	}
	public static long solution(long w, long h) {
		long scale = 1;
		for (int x = 2; x <= Math.min(w, h); x++) {
			if (w % x == 0 && h % x == 0)
				scale = x;
		}
		return w*h-(w+h-scale);
	}
//	public static long solution(long w, long h) {
//		long scale = 1;
//		for (int x = 2; x <= Math.min(w, h); x++) {
//			if (w % x == 0 && h % x == 0)
//				scale = x;
//		}
//		long transW = w/scale, transH = h/scale;
//		
//		double[] trans = new double[(int)transW+1];
//		trans[0] = 0; trans[trans.length-1] = transH;
//		
//		for(int x=1; x<=trans.length-2; x++) {
//			trans[x] = transH/(double)transW*x;
//		}
//		
//		long transSum = 0;
//		for(int x=0; x<trans.length-1; x++) {
//			transSum += Math.ceil(trans[x+1] - trans[x]);
//		}
//		
//		return w * h - (transSum*scale);
//	}
}
