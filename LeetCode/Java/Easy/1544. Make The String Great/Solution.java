class Solution{
    public String makeGood(String s){
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!st.isEmpty()&&Character.toLowerCase(st.peek())==Character.toLowerCase(ch)&&st.peek()!=ch)
                st.pop();
            else
                st.push(ch);
        }

        String ans="";
        while(!st.isEmpty())
            ans=st.pop()+ans;

        return ans;
    }
}