package collection;

import java.util.*;

/**
 * Author:lorrie
 * Create:2019/3/22
 */
public class TestArrayList {
    public static void main(String[] args) {

        //List接口
//        List<String > list=new ArrayList<String>();
//        list.add("hello");
//        //重复元素
//        list.add("hello");
//        list.add("Java");
//        System.out.println("集合大小为："+list.size()+" 集合是否为空："+list.isEmpty());
//        for (int i=0;i<list.size();i++){
//            //get()方法
//            System.out.println(list.get(i));
//        }
//        System.out.println("删除hello后");
//        list.remove("hello");
//        System.out.println("集合大小为："+list.size()+" 集合是否为空："+list.isEmpty());
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println(list.contains("hello"));
//        System.out.println(list.contains("ABC"));
//        System.out.println(list);


        //Collection接口
        Collection<String > list=new ArrayList<String>();
        list.add("hello");
        list.add("hello");
        list.add("Java");
        Object[] objects=list.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
