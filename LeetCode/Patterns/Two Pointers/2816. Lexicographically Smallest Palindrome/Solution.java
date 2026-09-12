class Solution {
    public String makeSmallestPalindrome(String s) {
        char a[]=s.toCharArray();
        int i=0;
        int j=a.length-1;
        int c=0;

        while(i<j){
            if(a[i]==a[j]){
                i++;
                j--;
            }
            else{
                if(a[i]>a[j]){
                    a[i]=a[j];
                    c++;
                    i++;
                    j--;
                }
                else{
                    a[j]=a[i];
                    c++;
                    i++;
                    j--;
                }
            }
        }
        return new String(a);
    }
}