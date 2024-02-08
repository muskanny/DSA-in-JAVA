import java.util.*;

public class union {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {

            if (ans.contains(a[i])) {
                continue;

            } else {
                ans.add(a[i]);
            }
        }

        for (int j = 0; j < b.length; j++) {
            if (ans.contains(b[j])) {
                continue;
            } else {
                ans.add(b[j]);
            }
        }
        Collections.sort(ans);
        return ans;

    }
}