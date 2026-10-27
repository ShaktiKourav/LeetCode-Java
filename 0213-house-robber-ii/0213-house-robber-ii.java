class Solution {

    public int calMoney(int[] nums,int i,int n,int[] dp){
        if(i > n) return 0;

        if(dp[i] != -1) return dp[i];
        
        int take = nums[i]+calMoney(nums,i+2,n,dp); // include current
        int skip = calMoney(nums,i+1,n,dp);// excluded current
        

        return dp[i]  = Math.max(take,skip);
    }
    
    public int rob(int[] nums) {
        int  n = nums.length;
        if(n==1) return nums[0];
        int[] dp1 = new int[n]; // include first index
        Arrays.fill(dp1,-1);
        int case1 = calMoney(nums,0,n-2,dp1);

        int[] dp2 = new int[n]; // include first index
        Arrays.fill(dp2,-1);
        int case2 = calMoney(nums,1,n-1,dp2);

        return Math.max(case1,case2);

    }
}