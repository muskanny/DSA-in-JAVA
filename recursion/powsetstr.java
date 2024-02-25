import java.util.ArrayList;
import java.util.Arrays;

public class powsetstr {
    static ArrayList<ArrayList<Integer>> powerSet(int[] set, int index, ArrayList<ArrayList<Integer>> ans,
            ArrayList<Integer> subans) {
        int n = set.length;

        // base case
        if (index == n) {
            // System.out.println(curr);
            ans.add(new ArrayList<>(subans));
            return ans;
        }

        // Two cases for every element
        // (i) We consider the element
        // as part of the current subset
        // (ii) We do not consider the current
        // element as part of the current
        // subset
        subans.add(set[index]);
        powerSet(set, index + 1, ans, subans);
        subans.remove(subans.size() - 1);
        powerSet(set, index + 1, ans, subans);

        return ans;
    }

    public static void main(String[] args) {
        // char[] inputSet = { 'a', 'b', 'c' };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subans = new ArrayList<>();
        int[] inputSet = { 1, 2, 3 };
        System.out.println(powerSet(inputSet, 0, ans, subans));
    }
}
