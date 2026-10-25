class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left_most = findLeftMost(nums,target,n);
        int Right_most = findRightMost(nums,target,n);

        return new int[]{left_most,Right_most};

    }


    int findLeftMost(int[] nums,int target,int n){
        int l = 0;
        int r = n-1;
        int left_most = -1;

        while(l<=r){

        int mid = l+(r-l)/2;
        if(nums[mid] == target){
           
        left_most = mid;
        r = mid-1;
        }else if(nums[mid] < target){
            l = mid+1;
        }else{
            r = mid-1;
        }
        }

        return left_most;
    }

    int findRightMost(int[] nums,int target,int n){
        int l = 0;
        int r = n-1;
        int right_most = -1;

        while(l<=r){

        int mid = l+(r-l)/2;
        if(nums[mid] == target){
           
        right_most = mid;
        l = mid+1;
        }else if(nums[mid] < target){
            l = mid+1;
        }else{
            r = mid-1;
        }
    }
        return right_most;
    
    }


   
}