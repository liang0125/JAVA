import java.util.ArrayList;
/*
题目描述
输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
(注意: 在返回值的list中，数组长度大的数组靠前)
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
   public  ArrayList<ArrayList<Integer>> pathResult=new ArrayList<ArrayList<Integer>>();
    public  ArrayList<Integer> path=new ArrayList<Integer>();
    public  ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        //先序遍历
        if(root==null){
                return null;
            }
           path.add(root.val);
        if (root.left==null&&root.right==null&&root.val==target){
            pathResult.add(path);
            return pathResult;
        }
        if (root.val<=target&&root.left!=null){
            FindPath(root.left,target-root.val);
        }
        if (root.val<=target&&root.right!=null){
            FindPath(root.right,target-root.val);
        }
        path.remove(path.size()-1);
        return pathResult;
    }
}