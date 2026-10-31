class Solution {
    public int uniquePaths(int m, int n) {
        int memo[][] = new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(memo[i],-1);
        }

        return sum(m,n,0,0,memo);
    }

    private int sum(int m,int n,int i,int j,int memo[][]){
        if(i==m-1 && j==n-1) return 1;

        if(i>=m || j>=n) return 0;

        if(memo[i][j]!=-1) return memo[i][j];

        return memo[i][j] = sum(m,n,i+1,j,memo) + sum(m,n,i,j+1,memo);
    }
}