class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int zeroCount = 0;
        long product = 1;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product =product* num;
            }
        }

        if (zeroCount > 1) {
            return ans; 
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount == 1) {
                if (nums[i] == 0) {
                    ans[i] = (int) product;
                } else {
                    ans[i] = 0;
                }
            } else {
                ans[i] = (int) (product / nums[i]);
            }
        }

        return ans;
    }
}