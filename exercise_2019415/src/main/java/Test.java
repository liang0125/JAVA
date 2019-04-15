import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Author:lorrie
 * Create:2019/4/15
 *
 *
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Test {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<String>();
        if(str==null){
            return null;
        }
        if(str.length()==0){
            return list;
        }
        char[] c=str.toCharArray();
        TreeSet<String> treeSet=new TreeSet<String>();
        getSwap(c,0,c.length-1,treeSet);
        list.addAll(treeSet);
        return list;
    }

    private static void getSwap(char[] c, int start, int end, TreeSet<String> treeSet) {
        if (c==null){
            return;
        }
        if (start==end){
            treeSet.add(String.valueOf(c));
        }
        else {
            for (int i=start;i<=end;i++){
                swap(c,start,i);
                getSwap(c,start+1,end,treeSet);
                swap(c,start,i);
            }
        }
    }

    private static void swap(char[] c, int start, int i) {
        char tmp=0;
        tmp=c[start];
        c[start]=c[i];
        c[i]=tmp;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(Permutation(str));
    }
}
