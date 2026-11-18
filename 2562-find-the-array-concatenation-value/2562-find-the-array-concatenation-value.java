class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        long ans = 0;
        while(i<j){
            String temp = "" + nums[i] + nums[j];
            ans += Long.parseLong(temp);
            i++;
            j--;
        }
        if(i==j){
            ans += nums[i];
        }
        return ans;
    }
}