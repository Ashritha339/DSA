class Solution{
    public int calPoints(String[] operations){
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int x=st.pop();
                int y=st.peek();
                st.push(x);
                st.push(x+y);
                ans+=x+y;
            }
            else if(operations[i].equals("D")){
                int x=2*st.peek();
                st.push(x);
                ans+=x;
            }
            else if(operations[i].equals("C")){
                ans-=st.pop();
            }
            else{
                int x=Integer.parseInt(operations[i]);
                st.push(x);
                ans+=x;
            }
        }
        return ans;
    }
}