class Solution {
    public int countSquares(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int count =0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 0) continue;
                if(i>0 && j>0){
                    arr[i][j] +=  min(arr[i-1][j],arr[i][j-1],arr[i-1][j-1]);
                }

                count += arr[i][j];
            }
        }

        return count;
    }

    private int min(int a,int b,int  c){
        return Math.min(a,Math.min(b,c));
    }
}