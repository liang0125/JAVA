import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author:lorrie
 * Create:2019/4/12
 */
public class Test {
    /*
    题目描述
    输入n个整数，找出其中最小的K个数。
    例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList();
        if (input==null){
            return null;
        }
        if (k>input.length){
            return null;
        }
        for (int i=0;i<input.length-1;i++){
            for (int j=0;j<input.length-1-i;j++){
                if (input[j]>input[j+1]){
                    int tmp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=tmp;
                }
            }
        }
        for (int m=0;m<input.length;m++){
            System.out.println(input[m]);
        }
        for (int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a={7,6,5,4,3,2,1};
        System.out.println(GetLeastNumbers_Solution(a,3));
    }
}
