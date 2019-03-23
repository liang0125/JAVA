/**
 * Author:lorrie
 * Create:2019/3/23
 */

import java.util.Stack;

public class Test {
    /*
    题目描述
    两个栈实现一个队列
     */

//        public static Stack<Integer> stack1 = new Stack<Integer>();
//        public static Stack<Integer> stack2 = new Stack<Integer>();
//
//        public static void push(int node) {
//            stack1.push(node);
//        }
//
//        public static int pop() {
//
//            while (!stack1.isEmpty()){
//                stack2.push(stack1.peek());
//                stack1.pop();
//            }
//            int rs=stack2.peek();
//            stack2.pop();
//            while (!stack2.isEmpty()){
//                stack1.push(stack2.peek());
//                stack2.pop();
//            }
//            return rs;
//        }
//
//    public static void main(String[] args) {
//        push(1);
//        push(2);
//        push(3);
//        System.out.println(pop());
//        push(4);
//        System.out.println(pop());
//        System.out.println(pop());
//        push(5);
//        System.out.println(pop());
//        System.out.println(pop());
//    }

/*
题目描述
求一颗二叉树的镜像
 */
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

        public void Mirror(TreeNode root) {
            if (root==null){
                return;
            }
            else {
                TreeNode tmp=root.left;
                root.left=root.right;
                root.right=tmp;
                Mirror(root.left);
                Mirror(root.right);
            }
        }

    }
