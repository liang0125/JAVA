import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
/*
编译器版本: Java 1.8.0_66
请使用标准输入输出(System.in, System.out)；已禁用图形、文件、网络、系统相关的操作，
如java.lang.Process , javax.swing.JFrame , Runtime.getRuntime；不要自定义包名称，
否则会报错，即不要添加package answer之类的语句；您可以写很多个类，但是必须有一个类名为Main，
并且为public属性，并且Main为唯一的public class，Main类的里面必须包含一个名字为'main'的静态方法（函数），这个方法是程序的入口
时间限制: 3S (C/C++以外的语言为: 5 S)   内存限制: 128M (C/C++以外的语言为: 640 M)
输入:
第一行，整数N(城市数量,1<n<50)
第二行，整数K(小二数量,1<k<n)
第三行，int数组hotels(每个城市的酒店数量)
输出:
每个小二需要运营的城市数量，分号隔开
输入范例:
9
3
1, 2, 3, 1, 1, 3, 2, 3, 4
输出范例:
3;4;2;
 */
/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String citys(int n, int k, int[] hotels) {
        if (n<=0||k<=0||hotels==null){
            return null;
        }
        int sum=0;
        int avg=0;
        int[] mg=new int[k];
        for (int i=0;i<hotels.length;i++){
            sum+=hotels[i];
        }
        avg=sum/k;
        int f=0;
        int index=0;
        String rs="";
        int psum=0;
        while (f<hotels.length) {
            int flag=0;
            for (int j = f; j < hotels.length; j++) {
                if ((psum - avg) >= -2 && (psum - avg) <= 2) {
                     flag = j -f+ 1;
                    break;
                }
                else {
                    psum += hotels[j];
                }

            }
                rs=rs+String.valueOf(flag);
                if (index<k-1) {
                    rs+=";";
                    index++;
                }
            f=f+flag;
        }
        return rs;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _k;
        _k = Integer.parseInt(in.nextLine().trim());


        String hotelsStr = in.nextLine().trim();
        String[] hotelArray = hotelsStr.split(",");
        int[] _hotels = new int[hotelArray.length];

        for(int _hotels_i = 0; _hotels_i < hotelArray.length; _hotels_i++) {
            _hotels[_hotels_i] = Integer.parseInt(hotelArray[_hotels_i]);
        }

        res = citys(_n, _k, _hotels);
        System.out.println(res);
    }
}