import java.util.Scanner;

/**
 * Author:lorrie
 * Create:2019/4/7
 */
public class TestReverse {
    /*
    单词反转
        eg:输入：I am a student
           输出student a am I
     */
    public static String wordReverse(String s){
        if(s==null){
            return null;
        }
        String[] strs=s.split(" ");
        int i=0;
        int j=strs.length-1;
        while (i<j){
            String tmp=strs[i];
            strs[i]=strs[j];
            strs[j]=tmp;
            i++;
            j--;
        }
        String rs="";
       for (int m=0;m<strs.length;m++){
           if(m!=strs.length-1) {
               rs += strs[m] + " ";
           }
       }
       rs+=strs[strs.length-1];
       return rs;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(wordReverse(str));

    }
}
