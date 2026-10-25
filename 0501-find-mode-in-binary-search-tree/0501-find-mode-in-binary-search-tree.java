/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int currFreq = 0;
    int maxFreq = 0;
    int currNum = 0;

    List<Integer>result = new ArrayList<>();

    void dfs(TreeNode root){
        if(root == null){
            return;
        }

        dfs(root.left);

        if(root.val == currNum){
            currFreq++;
        }else{  // new number
            currNum = root.val;
            currFreq = 1;
        }

        if(currFreq > maxFreq){ // means new number 
            result.clear();
            maxFreq = currFreq;
        }

        if(currFreq == maxFreq){  // means same freq of another num
        result.add(root.val);
        }

        dfs(root.right);

    }

    public int[] findMode(TreeNode root) {
        dfs(root);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}