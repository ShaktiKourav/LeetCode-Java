import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        // Check duplicate frequencies
        for (int x : map.values()) {
            if (set.contains(x)) {
                return false;
            }
            set.add(x);
        }

        return true;
    }
}