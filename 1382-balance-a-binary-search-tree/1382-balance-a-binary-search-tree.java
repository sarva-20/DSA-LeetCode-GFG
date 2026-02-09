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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> sorted = new ArrayList<>();
        solve(sorted, root);
        return createBST(0, sorted.size()-1, sorted);
    }
    public void solve(List<Integer> l, TreeNode root){
        if(root==null){
            return;
        }
        solve(l, root.left);
        l.add(root.val);
        solve(l, root.right);
    }
    public TreeNode createBST(int l, int r, List<Integer> node){
        if(l>r){
            return null;
        }
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(node.get(mid));
        root.left = createBST(l, mid-1, node);
        root.right = createBST(mid+1,r,node);
        return root;


    }
}