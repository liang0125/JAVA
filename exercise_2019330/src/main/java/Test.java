import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Test {
    /*
    题目描述：
    给定一个字符串，求无重复字符的最大长度的子串
     */
    public static ArrayList<String> num(String str){
        if (str==null||str==""){
            return null;
        }
        ArrayList<String> list=new ArrayList<String>();
        for (int i=0;i<str.length()+1;i++){
            for (int j=1;j<str.length()+1;j++){
                if (i<j) {
                    String s=str.substring(i, j);
                    list.add(s);
                }
            }
        }
        return list;
    }
    public static String isnums(String s){
        if (s==null||s==""){
            return "NO";
        }
        char[] c=s.toCharArray();
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (int i=0;i<c.length;i++){
            if (!map.containsKey(c[i])){
                map.put(c[i],1);
            }
            else {
                int count=map.get(c[i]);
                map.put(c[i],++count);
            }
        }
        Iterator map1= (Iterator) map.entrySet().iterator();
        while (map1.hasNext()){
            Map.Entry m= (Map.Entry) map1.next();
            Character key= (Character) m.getKey();
            Integer value= (Integer) m.getValue();
            if (value!=1){
                return "NO";
            }
        }
        return "YES";
    }
    public static int solution(String strs){
        if((strs==null)||strs==""){
            return 0;
        }
        ArrayList<String> list=num(strs);
        Iterator<String> iterator=list.iterator();
        int max=0;
        while (iterator.hasNext()){
            String s1=iterator.next();
            if ("NO".equals(isnums(s1))){
                continue;
            }
            else {
                if ("YES".equals(isnums(s1))&&s1.length()>max){

                    max=s1.length();
                }
            }

        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(solution(str));

    }
}
