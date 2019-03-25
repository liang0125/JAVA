/**
 * Author:lorrie
 * Create:2019/3/25
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Test {
    /*
    题目描述
    判断一颗二叉树是否是平衡二叉树
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        else if((TreeDepth(root.left)-TreeDepth(root.right))>=-1&&(TreeDepth(root.left)-TreeDepth(root.right))<=1){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    计算一颗二叉树的高度
     */
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            int left = TreeDepth(root.left);
            int right = TreeDepth(root.right);
            if (left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }
}
