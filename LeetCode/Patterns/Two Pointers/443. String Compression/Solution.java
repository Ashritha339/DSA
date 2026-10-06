class Solution {
    public int compress(char[] chars) {
        int i=0;
        int count=1;
        String s="";
        for(int j=1;j<chars.length;j++){
            if(chars[i]==chars[j]){
                count++;
            }
            else{
                s+=chars[i];
                if(count>1){
                    s+=count;
                }
                count=1;
                i=j;
            }
        }
        s+=chars[i];
        if(count>1){
            s+=count;
        }
        for(int l=0;l<s.length();l++){
            chars[l]=s.charAt(l);
        }
        return s.length();
    }
}