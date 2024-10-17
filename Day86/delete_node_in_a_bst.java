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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else { 
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            // copy the value and then delete the val;
            TreeNode successor = inOrderSucc(root);
            root.val = successor.val; 
            root.right = deleteNode(root.right, successor.val); 
        }
        
        return root; 
    }
    
    private TreeNode inOrderSucc(TreeNode node) {
        // The successor is the leftmost node in the right subtree
        node = node.right;
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }
}