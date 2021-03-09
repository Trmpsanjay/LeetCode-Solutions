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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        if(root==null)
            return ans;
        
		Queue<TreeNode> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
      
		while(!pendingNodes.isEmpty()) {
            int size = pendingNodes.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
              TreeNode curr = pendingNodes.remove();
                temp.add(curr.val);
                if(curr.left!=null)
                    pendingNodes.add(curr.left);
                if(curr.right!=null)
                    pendingNodes.add(curr.right);
            }
            ans.add(temp);
		}
        return ans;
        
    }
}
