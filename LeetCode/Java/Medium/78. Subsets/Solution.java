class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int nums[], int index, ArrayList<Integer> op, List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(op);
            return;
        }

        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        op2.add(nums[index]);

        solve(nums, index + 1, op1, ans);
        solve(nums, index + 1, op2, ans);
    }
}