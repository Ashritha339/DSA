class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, "", ans);
        return ans;
    }

    public void solve(int[] ip, String op, List<List<Integer>> ans) {

        if (ip.length == 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < op.length(); i++) {
                temp.add(op.charAt(i) - '0');
            }
            ans.add(temp);
            return;
        }

        String op1 = op;
        String op2 = op;

        op2 = op2 + ip[0];

        ip = Arrays.copyOfRange(ip, 1, ip.length);

        solve(ip, op1, ans);
        solve(ip, op2, ans);
    }
}