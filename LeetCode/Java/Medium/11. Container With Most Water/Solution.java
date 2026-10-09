
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;

        while(i<j){
            int h=height[i];

            if(height[j]<h){
                h=height[j];
            }

            int width=j-i;
            int area=h*width;

            if(area>max){
                max=area;
            }

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return max;
    }
}