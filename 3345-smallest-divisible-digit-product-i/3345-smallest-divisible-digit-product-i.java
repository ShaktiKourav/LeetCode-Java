class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (isValid(n, t)) {
                return n;
            }
            n++;
        }
    }

    private boolean isValid(int num, int t) {
        int product = 1;
        int x = num;

        // Handle 0 explicitly since its digit product is 0
        if (x == 0) {
            product = 0;
        } else {
            while (x > 0) {
                product *= (x % 10);
                x /= 10;
            }
        }

        return product % t == 0;
    }
}