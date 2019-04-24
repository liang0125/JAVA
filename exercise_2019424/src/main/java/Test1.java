/**
 * Author:lorrie
 * Create:2019/4/24
 *
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 假设输入的数组的任意两个数字都互不相同。
 */
public class Test1 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null||sequence.length==0){
            return false;
        }
       return test_V(sequence,0,sequence.length-1);//递归
    }
    public static boolean test_V(int[] sequence,int start,int last){
        if (last==start||start>last){
            return true;
        }
        int index = 0;
        int root=sequence[last];
        boolean flag=true;//标志位：表示有无左子树
        for (int i=last-1;i>=start;i--){
            if (sequence[i]<root){
                index=i;
                flag=false;
                break;
            }
        }
        for (int j=index-1;j>=start;j--){
            if (sequence[j]>root&&flag==false){//有左子树并且里面有比root大的说明不是二叉搜索树
                return false;
            }
        }
       return test_V(sequence,start,index)&& test_V(sequence,index+1,last-1);
        //左右子树都满足
    }

    public static void main(String[] args) {
        int[] a={3,2,1};
        System.out.println(VerifySquenceOfBST(a));
    }

}
