class Solution {
	public boolean backtrack(
		char[][] board,
		int row, int col,
		int index,
		String word,
		boolean[][] visit
	) {
		int m=board.length;
		int n=board[0].length;
		if(index==word.length())
			return true;
		if(row<0||col<0||row>=m||col>=n)
			return false;
		if(board[row][col]!=word.charAt(index))
			return false;
		if(visit[row][col])
			return false;
		visit[row][col]=true;
		boolean left=backtrack(
			board,row,col-1,index+1,word,visit);
		if(left)
			return true;
		boolean right=backtrack(
			board,row,col+1,index+1,word,visit);
		if(right)
			return true;

		boolean up=backtrack(
			board,row-1,col,index+1,word,visit);
		if(up)
			return true;

		boolean down=backtrack(
			board,row+1,col,index+1,word,visit);
		if(down)
			return true;

		visit[row][col]=false;

		return false;
	}

	public boolean exist(char[][] board, String word) {
		int m=board.length;
		int n=board[0].length;

		boolean[][] visit=new boolean[m][n];

		for(int i=0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (backtrack(board, i, j, 0, word, visit))
					return true;
			}
		}

		return false;
	}
}