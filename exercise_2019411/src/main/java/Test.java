import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Author:lorrie
 * Create:2019/4/11
 */
public class Test {
    //求两个字符串的最长公共子串
    public static String commonSubstr(String s1,String s2){
        Map<String ,Integer> map=new HashMap<String, Integer>();
        if (s1==null||s2==null){
            return null;
        }
        if (s1==""||s2==""){
            return null;
        }
        for (int i=0;i<s1.length();i++){
            for (int j=1;j<=s1.length();j++){
                if (i==j){
                    continue;
                }
                if (i<j) {
                    String substr = s1.substring(i, j);
                int len=substr.length();
                map.put(substr,len);
                }
            }
        }
        System.out.println(map);
        Iterator iterator=map.entrySet().iterator();
        int max=-1;
        String maxKey="";
        while (iterator.hasNext()){
            Map.Entry m= (Map.Entry) iterator.next();
            String key= (String) m.getKey();
            Integer value= (Integer) m.getValue();
            if (value>max&&isSubstr(s2,key)){
                max=value;
                maxKey=key;
            }
        }
        return maxKey;
    }
    public static boolean isSubstr(String s1,String  s2){
        Map<String,Integer> map=new HashMap<String, Integer>();
        if (s1==null||s2==null){
            return false;
        }
        if (s1==""||s2==""){
            return false;
        }
        for (int i=0;i<s1.length();i++){
            for (int j=1;j<=s1.length();j++){
                if (i==j){
                    continue;
                }
                if (i<j) {
                    String substr = s1.substring(i, j);
                    int len=substr.length();
                    map.put(substr,len);
                }
            }
        }
        Iterator iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry m= (Map.Entry) iterator.next();
            String key= (String) m.getKey();
            if (s2.equals(key)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        System.out.println(commonSubstr(str1,str2));
    }
}
