//leetcode 236.二叉树的最近公共祖先
//题目： 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
//思路； 递归。先深度遍历该树。当你遇到节点 p 或 q 时，返回一些布尔值作为标记。标记有助于确定是否在任何路径中找到了所需的节点。最不常见的祖先将是两个子树递归都返回 true 标记的节点。它也可以是一个节点，它本身是 p 或 q 中的一个，对于这个节点,子树递归返回一个 true 标记。
//时间复杂度：O(N) ，N 是二叉树中的节点数，最坏情况下，我们需要访问二叉树的所有节点。
//空间复杂度：O(N) ，这是因为递归栈使用的最大空间位 N ,斜二叉树的高度可以是 N 。


class Solution {

    private TreeNode ans;

    public Solution() {
        // Variable to store LCA node.
        this.ans = null;
    }

    private boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {

        // If reached the end of a branch, return false.
        if (currentNode == null) {
            return false;
        }

        // Left Recursion. If left recursion returns true, set left = 1 else 0
        int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;

        // Right Recursion
        int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;

        // If the current node is one of p or q
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;


        // If any two of the flags left, right or mid become True
        if (mid + left + right >= 2) {
            this.ans = currentNode;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Traverse the tree
        this.recurseTree(root, p, q);
        return this.ans;
    }
}
