import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Author:lorrie
 * Create:2019/4/6
 */
/*
输入一个字符串数组，
判断一下里面有几组满足类似（picture   turepic一个字符串是另一个字符串右移后的单词）
 */
public class TestReverse {
//判断有多少组
    public static int howMany(String[] strs){
        if (strs==null){
            return 0;
        }
        int count=0;
        for (int i=0;i<strs.length-1;i++){
            for (int j=i+1;j<strs.length;j++){
                if(i==j){
                    continue;
                }
                boolean flag=isRightReverse(strs[i],strs[j]);
                if (flag==true){
                    count++;
                }
            }
        }
        return count;
    }

    //判断str2是不是str1右转之后的字符串
    private static boolean isRightReverse(String str1, String str2) {
        if (str1==null||str2==null){
            return false;
        }
        char[] s1=str1.toCharArray();
        List<Character> list=new LinkedList();
        List<String> list1=new ArrayList<String>();
        for (int i=0;i<s1.length;i++){
            list.add(s1[i]);
        }
        for (int j=list.size()-1;j>=0;j--){
            Character c=s1[j];
            list.remove(c);
            list.add(0,c);
            list1.add(String.valueOf(list));
        }
        char[] s2=str2.toCharArray();
        String ss="[";
        for (int i=0;i<s2.length;i++){
            ss+=s2[i];
            if (i!=s2.length-1){
            ss+=", ";}
        }
        ss+="]";
       Iterator iterator=list1.iterator();
       while (iterator.hasNext()){
           String sts= (String) iterator.next();
           if (sts.equals(ss)){
               return true;
           }
       }
        return false;
    }

    public static void main(String[] args) {
        String[] strings={"abcde","cdeab","bcdea","adc","123456"};
        System.out.println(howMany(strings));

    }
}
