class Solution{
    public String reverseStr(String s,int k){
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i+=2*k){
            int l=i;
            int r=i+k-1;
            if(r>=a.length){
                r=a.length-1;
            }
            while(l<r){
                char t=a[l];
                a[l]=a[r];
                a[r]=t;
                l++;
                r--;
            }
        }
        return new String(a);
    }
}