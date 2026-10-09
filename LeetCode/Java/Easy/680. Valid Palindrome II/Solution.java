class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left>=0&&right<=s.length()-1&&left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return expand(s,left,right-1)||expand(s,left+1,right);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean expand(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}