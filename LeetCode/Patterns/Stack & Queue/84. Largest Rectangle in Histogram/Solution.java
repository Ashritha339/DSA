class Solution {
    public int largestRectangleArea(int[] heights) {
        int width=0;
        int area=0;
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int h=heights[i];
            for(int j=i;j<heights.length;j++){
                h=Math.min(h,heights[j]);
                width=j-i+1;
                area=width*h;
                ans=Math.max(area,ans);
            }
        }
        return ans;
    }
}