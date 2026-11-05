class Solution {
    List<String> ans=new ArrayList<>();

    void find(int n,int open,int close,String s){
        if(open==0 && close==0){
            ans.add(s);
            return;
        }

        if(open>0){
            find(n,open-1,close,s+"(");
        }

        if(close>open){
            find(n,open,close-1,s+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        find(n,n,n,"");
        return ans;
    }
}