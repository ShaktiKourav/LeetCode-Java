class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            if (count <= k) {
                list.add(nums[i]);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}