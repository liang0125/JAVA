import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lorrie
 * Create:2019/4/22
 */
public class TestTransform {
    public static String transform(String s){
        String[] strs=s.split("_");
        String newS="";
        if (s==null){
            return null;
        }
        if (s.length()==0){
            return "";
        }
        List<String> list=new ArrayList<String>();
        if (s.length()>0){
            for (int i=0;i<strs.length;i++) {
                list.add(strs[i]);
            }
        }
        for (int i=0;i<list.size();i++){
            if (i>0){
                char first=list.get(i).charAt(0);
                String ss=String.valueOf(first).toUpperCase()+list.get(i).substring(1).toLowerCase();
                newS+=ss;
            }
            else {
                newS+=list.get(i).toLowerCase();
            }
        }
        return newS;
    }
}
