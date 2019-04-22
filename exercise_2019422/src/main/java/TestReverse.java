import java.util.*;

public class TestReverse {
/*
题目描述
对字符串中的所有单词进行倒排。

说明：

1、每个单词是以26个大写或小写英文字母构成；

2、非构成单词的字符均视为单词间隔符；

3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；

4、每个单词最长20个字母；
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String[] ss = s1.split("[^a-zA-Z]+");
          int i=0;
          int j=ss.length-1;
          while (i<j){
              String tmp=ss[i];
              ss[i]=ss[j];
              ss[j]=tmp;
              i++;
              j--;
          }
          for (int m=0;m<ss.length;m++){
              System.out.print(ss[m]);
              if (m!=ss.length-1){
                  System.out.print(" ");
              }
          }
        }
    }
}