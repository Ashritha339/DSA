class Solution{
    public List<String> buildArray(int[] target,int n){
        int i=1;
        int j=0;
        List<String> ll=new ArrayList<>();

        while(j<target.length){
            if(target[j]==i){
                ll.add("Push");
                j++;
                i++;
            }
            else{
                ll.add("Push");
                ll.add("Pop");
                i++;
            }
            
        }
        return ll;
    }
}