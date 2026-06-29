class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

      
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }
}