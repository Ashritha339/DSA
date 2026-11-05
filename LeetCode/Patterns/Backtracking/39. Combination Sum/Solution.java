class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void find(int[] arr,int idx,int target,ArrayList<Integer> al){
        if(target==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        if(idx>=arr.length || target<0)return;
        al.add(arr[idx]);
        find(arr,idx,target-arr[idx],al);
        al.remove(al.size()-1);
        find(arr,idx+1,target,al);
    }
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        ans=new ArrayList<>();
        find(candidates,0,target,new ArrayList<>());
        return ans;
    }
}