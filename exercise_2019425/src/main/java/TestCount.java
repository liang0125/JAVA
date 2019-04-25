import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author:lorrie
 * Create:2019/4/25
 */
public class TestCount {
    //数组中出现一半的数字（假设只有一个）
    public int MoreThanHalfNum_Solution_01(int [] array) {
        Arrays.sort(array);
        int count=0;
        for (int i=0;i<array.length;i++){
            if (array[i]==array[array.length/2]){
                count++;
            }
        }
        if (count>array.length/2){
            return array[array.length/2];
        }
        return 0;
    }
    public int MoreThanHalfNum_Solution_02(int [] array) {
        if (array==null||array.length==0){
            return -1;
        }
        int count=0;
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                count=map.get(array[i]);
                map.put(array[i],++count);
            }
        }
        int len=array.length;
        int mid=len/2;
        Iterator iterator=  map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry m= (Map.Entry) iterator.next();
            Integer key= (Integer) m.getKey();
            Integer value= (Integer) m.getValue();
            if (value>mid){
                return key;
            }
        }
        return -1;
    }
}
