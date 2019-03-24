import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author:lorrie
 * Create:2019/3/24
 */
public class Test {
    /*
    题目描述
    从上往下打印出二叉树的每个节点，同层节点从左至右打印。
//     */
//    class TreeNode {
//        int val = 0;
//        TreeNode left = null;
//        TreeNode right = null;
//
//        public TreeNode(int val) {
//            this.val = val;
//
//        }
//
//    }
//
//    public class Solution {
//        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//            ArrayList<Integer> list=new ArrayList<Integer>();
//            ArrayList<TreeNode> queue=new ArrayList<TreeNode>();
//            if (root==null){
//                return list;
//            }
//            queue.add(root);
//            while (queue.size()!=0){
//                TreeNode tmp=queue.remove(0);
//                if (tmp.left!=null){
//                    queue.add(tmp.left);
//                }
//                if (tmp.right!=null){
//                    queue.add(tmp.right);
//                }
//                list.add(tmp.val);
//            }
//            return list;
//        }
//    }


/*
题目描述
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
如果不存在则输出0。
 */
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            else {
                int count=map.get(array[i]);
                map.put(array[i],++count);
            }
        }
        Iterator iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry= (Map.Entry) iterator.next();
            Integer key= (Integer) entry.getKey();
            Integer value= (Integer) entry.getValue();
            if (value>array.length/2){
                return key;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
