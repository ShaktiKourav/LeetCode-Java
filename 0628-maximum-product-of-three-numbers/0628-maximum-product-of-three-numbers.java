

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return Math.max(
            nums[n - 1] * nums[n - 2] * nums[n - 3], // three largest
            nums[0] * nums[1] * nums[n - 1]          // two smallest (negative) + largest
        );
    }
}