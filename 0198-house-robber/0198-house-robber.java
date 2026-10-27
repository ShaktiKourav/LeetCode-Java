class Solution {

    public int calAmount(int[] nums,int i,int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int take =  nums[i]+calAmount(nums,i+2,dp);
        int skip = calAmount(nums,i+1,dp);
        return dp[i] = Math.max(take,skip);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return calAmount(nums,0,dp);
    }
}