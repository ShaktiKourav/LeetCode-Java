import java.util.Arrays;

class Solution {
    int[][] dp;

    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;

        if (n < d) {
            return -1;
        }

        dp = new int[n][d + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(jobDifficulty, n, 0, d);
    }

    int solve(int[] jd, int n, int idx, int d) {
        if (d == 1) {
            int maxD = 0;

            for (int i = idx; i < n; i++) {
                maxD = Math.max(maxD, jd[i]);
            }

            return maxD;
        }

        if (dp[idx][d] != -1) {
            return dp[idx][d];
        }

        int maxD = 0;
        int finalResult = Integer.MAX_VALUE;

        for (int i = idx; i <= n - d; i++) {
            maxD = Math.max(maxD, jd[i]);

            int result = maxD + solve(jd, n, i + 1, d - 1);

            finalResult = Math.min(finalResult, result);
        }

        return dp[idx][d] = finalResult;
    }
}