class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        String t = "1" + s + "1";

        List<Character> chars = new ArrayList<>();
        List<Integer> len = new ArrayList<>();

        int i = 0;
        while (i < t.length()) {
            char ch = t.charAt(i);
            int j = i;
            while (j < t.length() && t.charAt(j) == ch) {
                j++;
            }
            chars.add(ch);
            len.add(j - i);
            i = j;
        }

        int ans = ones;

        for (int k = 1; k < chars.size() - 1; k++) {
            if (chars.get(k) == '1'
                    && chars.get(k - 1) == '0'
                    && chars.get(k + 1) == '0') {

                ans = Math.max(ans,
                        ones + len.get(k - 1) + len.get(k + 1));
            }
        }

        return ans;
    }
}