class Solution {
    public int[] diStringMatch(String s) {
        int sl=s.length()+1;
        int a[]=new int[sl];
        int k=0;
        for(int j=0;j<sl;j++){
             a[k]=j;
             k++;
        }
        int z=0;
        int b=a.length-1;
        int l=0;
        int f[]=new int[sl];
        int i=0;
        while(i<s.length()){
            if(s.charAt(l)=='I'){
                f[i]=a[z];
                i++;
                z++;
                l++;
            }
            else if(s.charAt(l)=='D'){
                f[i]=a[b];
                i++;
                b--;
                l++;
            }
        }
        while(i<a.length){
            f[i]=a[z];
            i++;
        }
        return f;




    }
}