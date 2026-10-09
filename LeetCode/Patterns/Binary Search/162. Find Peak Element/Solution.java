class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;

        // Only one element
        if (n == 1) return 0;

        // First element is peak
        if (arr[0] > arr[1]) return 0;

        // Last element is peak
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Peak found
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Increasing slope
            else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            }

            // Decreasing slope
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}