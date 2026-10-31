class Solution {
    
    public int uniquePaths(int m, int n) {
       return sum(m,n,0,0);
    }
    private int sum(int m,int n,int i,int j){
        if(i==m-1&&j==n-1)return 1;
        if(i>=m||j>=n)return 0;
        return sum(m,n,i+1,j)+sum(m,n,i,j+1);

    }
}