class Solution {

    public int primePalindrome(int n) {

   
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

    
        for (int prefix = 10; prefix < 100000; prefix++) {

            String s = String.valueOf(prefix);

          

            String reverse = new StringBuilder(s)
                    .deleteCharAt(s.length() - 1)
                    .reverse()
                    .toString();

            int palindrome = Integer.parseInt(s + reverse);

         
            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }

        return -1;
    }

 
    private boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

      
        if (num % 2 == 0) {
            return false;
        }

      
        for (int i = 3; i * i <= num; i += 2) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}