/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int low = 0;
        int high = nums.length -1; 
        return helper(nums, low, high);
    }
    
    public TreeNode helper(int[] nums, int l, int h){
        if(l>h || l<0 || h>nums.length)
            return null;
        
        int max = nums[l];
        int idx = l;
        for(int i=l; i<=h; i++){
            if(nums[i]> max){
                max = nums[i];
                idx = i;
            }
        }
        
        TreeNode root = new TreeNode(max);
        
        root.left = helper(nums, l, idx-1);
        root.right = helper(nums, idx+1, h);
            
        return root;
    }
}