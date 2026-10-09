class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr1 = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            arr1[i] = sum;
        }

        return arr1;
    }
}