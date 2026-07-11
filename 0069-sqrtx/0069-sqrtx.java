class Solution {
    public int mySqrt(int x) {
        
        long  low = 0;
        long  high = x;
        long  ans = -1;
        while(low<=high){
           long   mid = low + (high-low)/2;
           long   square = mid*mid;
            if(square == x){
                return (int)mid;
            }else if(square < x){
                ans = mid;
                low = mid+1;
                }else{
                    high = mid-1;
                }

        }

        return (int)ans;
    }
}