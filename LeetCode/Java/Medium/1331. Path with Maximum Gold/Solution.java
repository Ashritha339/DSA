class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    ans=Math.max(ans,dfs(grid,i,j));
                }
            }
        }
        return ans;
    }
    private int dfs(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        int val=grid[i][j];
        grid[i][j]=0;
        int a=dfs(grid,i,j+1);
        int b=dfs(grid,i+1,j);
        int c=dfs(grid,i-1,j);
        int d=dfs(grid,i,j-1);
        grid[i][j]=val;
        return val+Math.max(Math.max(a,b),Math.max(c,d));
    }
}