class Solution {
    public int magicalString(int n) {
        String ms="122112";
        String s="";
        int ans=n/6;
        int ans1=n%6;
        int count=0;
        while(ans!=0){
            s+=ms;
            ans--;
        }
        for(int i=0;i<ans1;i++){
            s+=ms.charAt(i);
        }
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1' ){
                count++;
            }


           
        }
        return count;
        
    }
}