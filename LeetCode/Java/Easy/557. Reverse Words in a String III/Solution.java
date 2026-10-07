class Solution {
    public String reverseWords(String s) {
        String ans="";
        int j=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                for(int k=i-1;k>=j;k--){
                    ans+=s.charAt(k);
                }
                ans+=" ";
                j=i+1;
            }
        }

        for(int k=s.length()-1;k>=j;k--){
            ans+=s.charAt(k);
        }

        return ans;
    }
}