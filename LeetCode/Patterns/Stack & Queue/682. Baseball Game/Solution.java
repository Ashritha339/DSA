class Solution{
    public int calPoints(String[] operations){
        int[] arr=new int[operations.length];
        int top=-1;
        int ans=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                arr[++top]=arr[top-1]+arr[top-2];
                ans+=arr[top];
            }
            else if(operations[i].equals("D")){
                arr[++top]=2*arr[top-1];
                ans+=arr[top];
            }
            else if(operations[i].equals("C")){
                ans-=arr[top--];
            }
            else{
                arr[++top]=Integer.parseInt(operations[i]);
                ans+=arr[top];
            }
        }
        return ans;
    }
}