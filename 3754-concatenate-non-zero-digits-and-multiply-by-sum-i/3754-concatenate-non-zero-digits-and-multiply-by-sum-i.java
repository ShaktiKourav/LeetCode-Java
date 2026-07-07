class Solution {
    public long sumAndMultiply(int n) {
        
        long sum = 0;
        long ans = 0;
        long pow = 1;
        while(n>0){
            long rem = n%10;
           
            if(rem != 0){
                ans = rem*pow + ans;
                pow = pow*10;
            }
           n = n/10;
        }
        long temp = ans;

        // Sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }


        return ans*sum;

    }
}