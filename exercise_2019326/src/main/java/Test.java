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
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array==null||num1==null||num2==null){
            return;
        }
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            else {
                int count=map.get(array[i]);
                map.put(array[i],++count);
            }
        }
        Iterator iterator=map.entrySet().iterator();
        int[] a=new int[2];
        int i=0;
        while (iterator.hasNext()){
            Map.Entry m= (Map.Entry) iterator.next();
           Integer k= (Integer) m.getKey();
           Integer value= (Integer) m.getValue();
           if (value==1){
               a[i++]=k;
           }
        }
        num1[0]=a[0];
        num2[0]=a[1];
    }

    public static void main(String[] args) {
        int []array={1,1,2,2,3,3,4,5,6,6};
        int[] a=new int[1];
        int[]b=new int[1];
        FindNumsAppearOnce(array,a,b);
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}
