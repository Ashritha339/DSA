class Solution {
    List<String> ans=new ArrayList<>();
    void find(int n,int open,int close,String s){
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        if(open<n){
            find(n,open+1,close,s+"(");
        }
        if(close<open){
            find(n,open,close+1,s+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        find(n,0,0,"");
        return ans;
    }
}