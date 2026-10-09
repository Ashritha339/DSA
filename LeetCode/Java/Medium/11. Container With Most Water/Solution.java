class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxi=Integer.MIN_VALUE;
        while(i<j){
            maxi = Math.max(maxi, Math.min(height[i], height[j]) * (j - i));
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxi;
    }
}