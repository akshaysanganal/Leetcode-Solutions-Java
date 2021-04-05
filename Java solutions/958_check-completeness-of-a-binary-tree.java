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
    public boolean isCompleteTree(TreeNode root) {
        
        boolean first_null = false;
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)
            return first_null;
        
        q.add(root);
        
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            for(int i=0; i<size; i++) {
                
                TreeNode curr = q.poll();
                
                if(curr == null) {
                    first_null = true;
                }
                else {
                    
                    if(first_null)
                        return false;

                    q.offer(curr.left);
                    q.offer(curr.right);
                }
            }
            
        }
        
        return true;
        
    }
}