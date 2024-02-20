import java.io.*;
import java.util.*;

class pascal {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int currsize = 1;
        while (currsize < numRows + 1) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < currsize; i++) {
                if (i == 0 || i == currsize - 1) {
                    row.add(i, 1);
                } else {
                    int val = ans.get(currsize - 2).get(i - 1) + ans.get(currsize - 2).get(i);
                    row.add(i, val);
                }
            }
            ans.add(row);
            currsize++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}