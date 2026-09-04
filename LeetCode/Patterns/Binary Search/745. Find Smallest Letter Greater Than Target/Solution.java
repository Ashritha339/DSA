class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=letters[mid]-target;
            if(ans>0){
                
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return letters[low%letters.length];
    }
}

