package NonMain;

public class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int x=0; x<a.length; x++)
            ans += a[x];
        return ans;
    }
}
