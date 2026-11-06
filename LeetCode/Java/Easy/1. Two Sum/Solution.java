class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i=0;
       int j=nums.length-1;
       while(i<j){
        if(nums[i]+nums[j]==target){
            return new arr[]{i,j};
        }
        else if(nums[i]+nums[j]>target){
            j--;
        }else{
            i++;
        }
       }
       return  new arr[]{i,j};
    }
}