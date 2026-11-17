class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m=grid2.length;
        int n=grid2[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1&&grid2[i][j]==grid1[i][j]){
                    count++;
                    dfs(grid2,i,j,grid1);
                }
            }
        }
        return count-1;
    }
    private void dfs(int[][] grid2,int i,int j,int[][] grid1){
        if(i<0||i>=grid2.length||j<0||j>=grid2[i].length||grid2[i][j]==0){
            return;
        }
       

        
        grid2[i][j]=0;
        dfs(grid2,i,j+1,grid1);
        dfs(grid2,i+1,j,grid1);
        dfs(grid2,i-1,j,grid1);
        dfs(grid2,i,j-1,grid1);
        }
        

    }
    
