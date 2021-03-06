import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author:lorrie
 * Create:2019/3/26
 */
public class Test {
    /*
    题目描述:
    一个整型数组里除了两个数字之外，其他的数字都出现了两次。
    请写程序找出这两个只出现一次的数字。
     */
//    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
//        if (array==null||num1==null||num2==null){
//            return;
//        }
//        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
//        for (int i=0;i<array.length;i++){
//            if (!map.containsKey(array[i])){
//                map.put(array[i],1);
//            }
//            else {
//                int count=map.get(array[i]);
//                map.put(array[i],++count);
//            }
//        }
//        Iterator iterator=map.entrySet().iterator();
//        int[] a=new int[2];
//        int i=0;
//        while (iterator.hasNext()){
//            Map.Entry m= (Map.Entry) iterator.next();
//           Integer k= (Integer) m.getKey();
//           Integer value= (Integer) m.getValue();
//           if (value==1){
//               a[i++]=k;
//           }
//        }
//        num1[0]=a[0];
//        num2[0]=a[1];
//    }
//
//    public static void main(String[] args) {
//        int []array={1,1,2,2,3,3,4,5,6,6};
//        int[] a=new int[1];
//        int[]b=new int[1];
//        FindNumsAppearOnce(array,a,b);
//        System.out.println(a[0]);
//        System.out.println(b[0]);
//    }


    /*
    题目描述:
    在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
    如果没有则返回 -1（需要区分大小写）.
     */
//    public static int FirstNotRepeatingChar(String str) {
//        if (str==null){
//            return -1;
//        }
//        char[] c=str.toCharArray();
//        Map<Character,Integer> map=new HashMap<Character, Integer>();
//        for (int i=0;i<c.length;i++){
//            if (!map.containsKey(c[i])){
//                map.put(c[i],1);
//            }
//            else {
//                int count=map.get(c[i]);
//                map.put(c[i],++count);
//            }
//        }
//        Iterator iterator=map.entrySet().iterator();
//        Map<Character,Integer> map2=new HashMap<Character, Integer>();
//        while (iterator.hasNext()){
//            Map.Entry m= (Map.Entry) iterator.next();
//            Character k= (Character) m.getKey();
//            Integer value= (Integer) m.getValue();
//            if (value==1){
//                 map2.put(k,1);
//            }
//        }
//        for (int j=0;j<c.length;j++){
//            if (map2.containsKey(c[j])){
//                return j;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(FirstNotRepeatingChar("aabccddee"));
//    }


    /*
    题目描述
    统计一个数字在排序数组中出现的次数。
     */
//    public static int GetNumberOfK(int[] array, int k) {
//        if (array==null){
//            return 0;
//        }
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < array.length; i++) {
//            if (!map.containsKey(array[i])) {
//                map.put(array[i], 1);
//            } else {
//                int count = map.get(array[i]);
//                map.put(array[i], ++count);
//            }
//        }
//        Iterator iterator=map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry m= (Map.Entry) iterator.next();
//            Integer key= (Integer) m.getKey();
//            Integer value= (Integer) m.getValue();
//            if (key==k){
//                return value;
//            }
//        }
//        return 0;
//    }


/*
题目描述
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
    public static int Sum_Solution(int n) {
       int sum=n;
       boolean t=(n>0)&&(sum+=Sum_Solution(n-1))>0;
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(5));
    }
}
