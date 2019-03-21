import java.util.Stack;

/**
 * Author:lorrie
 * Create:2019/3/21
 */
/*
题目描述
输入两个整数序列，第一个序列表示栈的压入顺序
请判断第二个序列是否可能为该栈的弹出顺序。
假设压入栈的所有数字均不相等。
例如序列1,2,3,4,5是某栈的压入顺序，
序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class Test {
    public static boolean isPopOrder(int [] pushA,int [] popA) {
        if (popA.length==0||popA.length==0){
            return false;
        }
        Stack<Integer> stack1=new Stack<Integer>();
        int j=0;
        for (int i=0;i<popA.length;i++){
            stack1.push(pushA[i]);
            while (!stack1.isEmpty()&&stack1.peek()==popA[j]){
                stack1.pop();
                j++;
            }
        }
        return stack1.isEmpty();
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={4,3,5,1,2};
        System.out.println(isPopOrder(a,b));

    }
}
