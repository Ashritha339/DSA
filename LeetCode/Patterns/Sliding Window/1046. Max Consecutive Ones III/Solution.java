class Solution {
    public int longestOnes(int[] nums, int k) {
       int zeroc=0;
       int i=0;
       int j=0;
       int c=0;
       int maxi=0;

       while(j<nums.length){
        if(nums[j]==1){
            c++;
            j++;
        }
        else{
            if(zeroc<k){
                zeroc++;
                c++;
                j++;
            }
            else{
                if(nums[i]==0){
                    zeroc--;
                }
                i++;
                c--;
            }
        }
        maxi=Math.max(c,maxi);
       }

       return maxi;
    }
}