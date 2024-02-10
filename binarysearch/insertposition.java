class insertposition {
    public int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;

            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return start;
    }
}