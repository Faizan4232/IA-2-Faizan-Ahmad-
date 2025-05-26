
public class Q3robber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 9, 2, 1};
        int result = solution.rob(nums);
        System.out.println("Maximum amount that can be robbed: " + result);
    }
}

class Solution {

    public int rob(int[] nums) {
        return robFrom(0, nums);
    }

    public int robFrom(int i, int[] nums) {
        if (i >= nums.length) {
            return 0;
        }
        int skip = robFrom(i + 1, nums);
        int rob = nums[i] + robFrom(i + 2, nums);
        return Math.max(skip, rob);
    }
}
