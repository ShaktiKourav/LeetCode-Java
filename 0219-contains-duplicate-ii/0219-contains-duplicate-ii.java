import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Window me duplicate hai
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            // Window size k maintain karo
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}