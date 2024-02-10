import java.util.*;
import java.io.*;

public class ceilandfloor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int[] ans = new int[2];
        ans[0] = getfloor(a, n, x);
        ans[1] = getceil(a, n, x);

        return ans;

    }

    public static int getceil(int arr[], int n, int x) {
        int start = 0;
        int end = n - 1;
        int ansc = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= x) {

                ansc = arr[mid];
                end = mid - 1;

            }

            else {
                start = mid + 1;
            }
        }

        return ansc;
    }

    public static int getfloor(int arr[], int n, int x) {
        int start = 0;
        int end = n - 1;
        int ansf = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= x) {

                ansf = arr[mid];
                start = mid + 1;

            }

            else {
                end = mid - 1;
            }
        }

        return ansf;
    }

}