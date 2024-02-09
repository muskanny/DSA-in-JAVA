public class lowerbound {
    public static int lowerBound(int[] arr, int n, int x) {
        // Write your code here
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;

        int ans = x;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return ans;

    }
}