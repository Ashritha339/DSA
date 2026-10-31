class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        int one = helper(nums,0,nums.length-2);
        int two = helper(nums,1,nums.length-1);
        return Math.max(one,two);
    }
    public int helper(int nums[],int start,int n){
        if(n < start)return 0;
        if(n == start)return nums[start];
        return Math.max(helper(nums,start,n-1),helper(nums,start,n-2) + nums[n]);
    }
}