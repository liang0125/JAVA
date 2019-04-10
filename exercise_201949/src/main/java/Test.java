import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lorrie
 * Create:2019/4/9
 */
public class Test {
    //反转单词
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String str=sb.reverse().toString();
        System.out.println(str);

    }
}
