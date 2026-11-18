class Solution {
    public void reverse(char[] arr, int i,int j){
         while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
       char[] arr  = s.toCharArray();
       int i=0,n = arr.length;
       while(i<n){
         int j= Math.min(i+k-1,n-1);
         reverse(arr,i,j);
         i=i+2*k;
       }
        return new String(arr);
    }
}