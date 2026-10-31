class Solution {
    public int reverse(int n){
        int r=0;
        while(n!=0){
            int rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        return r;
    }
    public long sumAndMultiply(int n) {
        int r1=0;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            if(rem!=0){
                
              r1=r1*10+rem;
              sum=sum+rem;
              
            }
            
            
            n=n/10;
        }
        int r2=reverse(r1);
        return (long)r2*sum;
    }
}