class Solution {
    public int minimumPairRemoval(int[] nums) {
       ArrayList<Integer>list = new ArrayList<>();

       for(int num : nums){
        list.add(num);
       }

       int operations = 0;

       while(!isSorted(list)){
            int index = minPairSum(list);
            list.set(index,list.get(index)+list.get(index+1));
            list.remove(index+1);
            operations++;
       }

       return operations;
    }


    public  int minPairSum(List<Integer>nums){
        int minSum = Integer.MAX_VALUE;
        int index = -1;

        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)+nums.get(i+1)<minSum){
                index =  i;
                minSum = nums.get(i)+nums.get(i+1);
            }
        }

        return index;
    }

    public boolean isSorted(List<Integer>nums){
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                return false;
            }
        }

        return true;
    }
}