import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int start = 1;
        int end = position[position.length - 1] - position[0];
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canPlace(position, m, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public boolean canPlace(int[] position, int m, int dist) {
        int count = 1;
        int last = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= dist) {
                count++;
                last = position[i];

                if (count == m) {
                    return true;
                }
            }
        }

        return false;
    }
}