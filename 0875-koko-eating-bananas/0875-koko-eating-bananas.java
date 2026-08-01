class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > end) {
                end = piles[i];
            }
        }

        while (start < end) {

            int mid = start + (end - start) / 2;

            long hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}