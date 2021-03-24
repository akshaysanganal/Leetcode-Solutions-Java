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
    HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
     
        findParent(root, null);
        
        HashSet<TreeNode> seen = new HashSet<>();
        
        Queue<TreeNode> qu = new LinkedList<>();
        int level = 0;
        qu.add(target);
        seen.add(target);
        
        while(!qu.isEmpty() && level != K){
            int size = qu.size();
            
            for(int i=0; i<size; i++){
                TreeNode current = qu.poll();
                
                if(current.left != null && !seen.contains(current.left)){
                    qu.add(current.left);
                    seen.add(current.left);
                }
                    
                if(current.right != null && !seen.contains(current.right)){
                    qu.add(current.right);
                    seen.add(current.right);
                }
                
                if(parent.get(current) != null && !seen.contains(parent.get(current))){
                    qu.add(parent.get(current));
                    seen.add(parent.get(current));
                }
                
            }
            level++;
        }
        
        List<Integer> result = new ArrayList();
        
        while(!qu.isEmpty()){
            TreeNode curr = qu.poll();
            result.add(curr.val);
        }
                
        
        return result;
        
        
    }
    
    public void findParent(TreeNode child, TreeNode par){
        if(child != null){
            parent.put(child, par);
            findParent(child.left, child);
            findParent(child.right, child);
        }
    }
}