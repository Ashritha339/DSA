class Solution {
    public int rob(int[] nums) {
        return Math.max(solve(nums, 0 ),solve(nums,1));
    }
    public int solve(int[] nums, int i){
        if(i>=nums.length) return 0;
        int steal = nums[i]+solve(nums, i+2);
        int skip = solve(nums, i+1);
        return Math.max(steal, skip);
    }
}