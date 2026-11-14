import java.util.*;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(nums, 0, new ArrayList<>());
        return ans;
    }

    private void solve(int[] nums, int index, List<Integer> sol) {

        if(index == nums.length) {
            ans.add(new ArrayList<>(sol));
            return;
        }

        // Include
        sol.add(nums[index]);
        solve(nums, index + 1, sol);
        sol.remove(sol.size() - 1);

        // Exclude
        int next = index + 1;

        while(next < nums.length && nums[next] == nums[index]) {
            next++;
        }

        solve(nums, next, sol);
    }
}