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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null)
            return result;
        
        q.add(root);
        int level = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> current = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(level%2==0)
                    current.add(curr.val);
                else
                    current.add(0,curr.val);
                
                if(curr.left != null)
                    q.add(curr.left);
                
                if(curr.right != null)
                    q.add(curr.right);
                
            }
            level++;
            result.add(current);
        }
        
        return result;
        
    }
}