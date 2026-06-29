class Solution {
    static class Fenwick {
        int[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 2];
        }

        void update(int i, int val) {
            while (i <= n) {
                bit[i] += val;
                i += i & -i;
            }
        }

        int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= i & -i;
            }
            return sum;
        }
    }

    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + (nums[i] == target ? 1 : -1);
        }

        Set<Integer> set = new HashSet<>();
        for (int x : pref) set.add(x);

        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < sorted.size(); i++) {
            rank.put(sorted.get(i), i + 1);
        }

        Fenwick bit = new Fenwick(sorted.size() + 2);

        long ans = 0;

        bit.update(rank.get(pref[0]), 1);

        for (int i = 1; i <= n; i++) {
            int r = rank.get(pref[i]);
            ans += bit.query(r - 1);
            bit.update(r, 1);
        }

        return ans;
    }
}