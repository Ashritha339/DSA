class Solution {
    public String compressedString(String word) {
        String comp="";
        int i=0;

        while(i<word.length()) {
            int j=i;
            int count=0;

            while(j<word.length()&&word.charAt(i)==word.charAt(j)&&count< 9) {
                count++;
                j++;
            }

            comp+=count;
            comp+=word.charAt(i);

            i=j;
        }

        return comp;
    }
}