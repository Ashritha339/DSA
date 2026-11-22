class Solution {
    private void dfs(int i,int j,int visit[][],char[][] board){
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]=='.'||visit[i][j]==1)return;

        if(visit[i][j]!=1){
            visit[i][j]=1;
            dfs(i+1,j,visit,board);
            dfs(i-1,j,visit,board);
            dfs(i,j+1,visit,board);
            dfs(i,j-1,visit,board);
        }
    }
    public int countBattleships(char[][] board) {
        int visit[][]=new int[board.length][board[0].length];
        int c=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    if(visit[i][j]!=1){
                    dfs(i,j,visit,board);
                    c++;
                }
                }
                
            }
        }
        return c;
    }
}