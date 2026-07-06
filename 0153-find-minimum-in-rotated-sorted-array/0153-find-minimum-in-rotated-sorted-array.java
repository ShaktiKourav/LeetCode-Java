class Solution {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            // Entire array sorted
            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            int mid = low + (high - low) / 2;

            // Left half sorted
            if (nums[low] <= nums[mid]) {

                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }

            // Right half sorted
            else {

                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}