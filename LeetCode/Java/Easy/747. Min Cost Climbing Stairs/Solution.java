class Solution {
    int func(int arr[],int idx,int memo[]){
        if(idx>=arr.length)return 0;
        if(memo[idx]!=-1)return memo[idx];
        memo[idx]=arr[idx]+Math.min(func(arr,idx+1,memo),func(arr,idx+2,memo));
        return memo[idx];
    }
    public int minCostClimbingStairs(int[] arr) {
        int memo[]=new int[arr.length];
        Arrays.fill(memo,-1);
        return Math.min(func(arr,0,memo),func(arr,1,memo));
    }
}