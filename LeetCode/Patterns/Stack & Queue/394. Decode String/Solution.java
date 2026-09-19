class Solution{
    public String decodeString(String s){
        Stack<Integer> nums=new Stack<>();
        Stack<String> st=new Stack<>();
        int num=0;
        String str="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='0'&&ch<='9'){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                nums.push(num);
                st.push(str);
                num=0;
                str="";
            }
            else if(ch==']'){
                int n=nums.pop();
                String temp=st.pop();

                for(int j=0;j<n;j++){
                    temp+=str;
                }

                str=temp;
            }
            else{
                str+=ch;
            }
        }

        return str;
    }
}