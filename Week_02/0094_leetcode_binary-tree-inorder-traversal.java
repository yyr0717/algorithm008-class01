//leetcode 94. 二叉树的中序遍历
//题目：给定一个二叉树，返回它的中序 遍历。
//思路：递归，熟练掌握，左根右
//时间复杂度：O(n)。递归函数 T(n) = 2 * T(n/2)+1。
//空间复杂度：最坏情况下需要空间O(n)，平均情况为O(log n)。


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
    public List<Integer> inorderTraversal(TreeNode root) {
           List <Integer> res = new  ArrayList<>();
           helper(root, res);
           return res;
    }

    public void helper(TreeNode root, List <Integer> res){
            if(root != null){
                if(root.left != null){
                    helper(root.left, res);
                }
                res.add(root.val);
                if(root.right != null){
                    helper(root.right, res);
                }
            }
    }
}
