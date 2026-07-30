class Solution {
    public int minimumPushes(String word) {
        int n = word.length();

        int rem = n % 8;
        int comp = n / 8;

        int ans = 8 * comp * (comp + 1) / 2 + (comp + 1) * rem;

        return ans;
    }
}