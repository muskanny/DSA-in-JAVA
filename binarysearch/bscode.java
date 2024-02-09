class Solution {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 1, 7, 9, 4 };
        System.out.println(search(arr, 7));
    }
}