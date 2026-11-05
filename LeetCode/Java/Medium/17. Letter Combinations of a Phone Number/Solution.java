class Solution {
    List<String> ans=new ArrayList<>();
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void find(String digits,int idx,String s){
        if(idx==digits.length()){
            ans.add(s);
            return;
        }
        String letters=map[digits.charAt(idx)-'0'];
        for(int i=0;i<letters.length();i++){
            find(digits,idx+1,s+letters.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits){
        if(digits.length()==0)return ans;
        find(digits,0,"");
        return ans;
    }
}